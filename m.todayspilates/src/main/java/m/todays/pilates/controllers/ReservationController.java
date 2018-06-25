package m.todays.pilates.controllers;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import m.todays.pilates.common.BaseController;
import m.todays.pilates.common.SessionUtils;
import m.todays.pilates.common.api.ApiResponse;
import m.todays.pilates.domain.reservation.member.MemberResrvService;
/**
 * 
 * ��� �� ����API Controller
 * (ȸ��, ������, ������)
 * @Author 	: User
 * @Date	: 2018. 6. 21.
 * @Version : 
 *
 */
@Controller
public class ReservationController extends BaseController {

	@Autowired
	MemberResrvService memberResrvService;
	
	/**
	 * ȸ�� - ������Ȳ ���
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: getMemberReservation
	 * @comment		: 
	 * @auth		: ȸ��
	 * @param storCd �����ڵ�
	 * @param memberNo ȸ����ȣ
	 * @return
	 */
	@RequestMapping(value = "/api/member/reservation", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getMemberReservation(
			@RequestParam String storCd, 
			@RequestParam String memberNo) {
		String compCd = SessionUtils.getCurrentUser().getCompCd();
		return memberResrvService.getMemberReservation(compCd, storCd, memberNo);
	}
	/**
	 * ȸ�� - ��볻������
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: getDetailUseLesson
	 * @comment		: 
	 * @auth		: ȸ��
	 * @param storCd �����ڵ�
	 * @param lsnCd �����ڵ� 
	 * @param memberNo ȸ����ȣ 
	 * @return
	 */
	@RequestMapping(value = "/api/member/reservation/detail", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getDetailUseLesson(
			@RequestParam String storCd,
			@RequestParam String lsnCd,
			@RequestParam String memberNo) {
		String compCd = SessionUtils.getCurrentUser().getCompCd();
		return memberResrvService.getDetailUseLesson(compCd, storCd, lsnCd, memberNo);
	}
	/**
	 * ȸ�� - �� �Ƚ��
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: getMemberLessonSummary
	 * @comment		: 
	 * @auth		: ȸ��
	 * @param storCd ��������
	 * @param memberNo ȸ����ȣ
	 * @return
	 */
	@RequestMapping(value = "/api/member/lesson/summary", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getMemberLessonSummary(
			@RequestParam String storCd,
			@RequestParam String memberNo) {
		String compCd = SessionUtils.getCurrentUser().getCompCd();
		return memberResrvService.getLessonSummary(compCd, storCd, memberNo);
	}
	/**
	 * ���η����⼮�� (�ֺ� ����������Ȳ)
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: getWeeklyLesson
	 * @comment		: 
	 * @auth		: ������, ������
	 * @param storCd ��������
	 * @param memberNo ȸ����ȣ
	 * @param empNo �������ڵ�
	 * @param sttDt ��ȸ������(YYYYMMDD)
	 * @param endDt ��ȸ������(YYYYMMDD)
	 * @return
	 */
	@RequestMapping(value = "/api/teacher/reservation/weekly", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getWeeklyLesson(
			@RequestParam String storCd,
			@RequestParam(defaultValue="") String memberNo,
			@RequestParam(defaultValue="") String empNo,
			@RequestParam String sttDt,
			@RequestParam String endDt) {
		String compCd = SessionUtils.getCurrentUser().getCompCd();
		return memberResrvService.getWeeklyLesson(compCd, storCd, memberNo, empNo, sttDt, endDt);
	}
	
	/**
	 * ���η��� - ������� ����
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: getUserLessons
	 * @comment		: 
	 * @auth		: ������, ������
	 * @param storCd �����ڵ�
	 * @param memberNo ȸ����ȣ
	 * @param empNo �������ڵ�
	 * @return
	 */
	@RequestMapping(value = "/api/teacher/reservation/lessons", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getUserLessons(
			@RequestParam String storCd,
			@RequestParam(defaultValue="") String memberNo,
			@RequestParam(defaultValue="") String empNo) {
		String compCd = SessionUtils.getCurrentUser().getCompCd();
		return memberResrvService.getUserLesson(compCd, storCd, memberNo, empNo);
	}
	
	/**
	 * ���η����⼮�� - ������Ȳ
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: getWeeklyDetail
	 * @comment		: 
	 * @auth		: ������, ������
	 * @param storCd �����ڵ�
	 * @param memberNo ȸ����ȣ
	 * @param empNo �������ڵ�
	 * @param sttDt ��ȸ������(YYYYMMDD)
	 * @param endDt ��ȸ������(YYYYMMDD)
	 * @return
	 */
	@RequestMapping(value = "/api/teacher/reservation/list", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getWeeklyDetail(
			@RequestParam String storCd,
			@RequestParam(defaultValue="") String memberNo,
			@RequestParam(defaultValue="") String empNo,
			@RequestParam String sttDt,
			@RequestParam String endDt) {
		String compCd = SessionUtils.getCurrentUser().getCompCd();
		return memberResrvService.getWeeklyDetail(compCd, storCd, memberNo, empNo, sttDt, endDt);
	}
	/**
	 * ���η����⼮�� - �⼮/�Ἦ, ������� ó��
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: editLessonAttand
	 * @comment		: /api/teacher/reservation/edit
	 * @auth		: ������, ������
	 * @param requestParams [
				   {
				        "lsnNm": "����",
				        "empNm": "��̸�",
				        "lsnTm": 1,
				        "empNo": "00005",
				        "lsnSeq": 4,
				        "lsnUseCnt": 0,
				        "compCd": "0001",
				        "lsnNo": "002",
				        "lsnCd": "01",
				        "lsnCnt": 20,
				        "storCd": "001",
				        "memberNo": "00008",
				        "rsvTm": "2000",
				        "memberNm": "���ֿ�",
				        "dy": "��",
				        "atndFg": "2",
				        "rsvDt": "20180615",
				        "lsnEdDt": ""
				    }
				]
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/api/teacher/reservation/edit", method = RequestMethod.PUT, produces = APPLICATION_JSON)
	public ApiResponse editLessonAttand(@RequestBody List<HashMap> requestParams) {
		return memberResrvService.attend(requestParams);
	}
	/**
	 * ���η����⼮�� - ����ó��
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: addReservation
	 * @comment		: /api/teacher/reservation/add
	 * @auth		: ������, ������
	 * @param requestParams [
				   {
				        "lsnNm": "����",
				        "empNm": "��̸�",
				        "lsnTm": 1,
				        "empNo": "00005",
				        "lsnSeq": 4,
				        "lsnUseCnt": 0,
				        "compCd": "0001",
				        "lsnNo": "002",
				        "lsnCd": "01",
				        "lsnCnt": 20,
				        "storCd": "001",
				        "memberNo": "00008",
				        "rsvTm": "2000",
				        "memberNm": "���ֿ�",
				        "dy": "��",
				        "atndFg": "2",
				        "rsvDt": "20180615",
				        "lsnEdDt": ""
				    }
				]
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/api/teacher/reservation/add", method = RequestMethod.PUT, produces = APPLICATION_JSON)
	public ApiResponse addReservation(@RequestBody List<HashMap> requestParams) {
		return memberResrvService.reservation(requestParams);
	}
	/**
	 * ���η����⼮�� : �������
	 * @package 	: m.todays.pilates.controllers
	 * @file 		: ReservationController.java
	 * @method		: deleteReservation
	 * @comment		: /api/reservation/delete
	 * @auth		: ������, ������
	 * @param requestParams [
				   {
				        "lsnNm": "����",
				        "empNm": "��̸�",
				        "lsnTm": 1,
				        "empNo": "00005",
				        "lsnSeq": 4,
				        "lsnUseCnt": 0,
				        "compCd": "0001",
				        "lsnNo": "002",
				        "lsnCd": "01",
				        "lsnCnt": 20,
				        "storCd": "001",
				        "memberNo": "00008",
				        "rsvTm": "2000",
				        "memberNm": "���ֿ�",
				        "dy": "��",
				        "atndFg": "2",
				        "rsvDt": "20180615",
				        "lsnEdDt": ""
				    }
				]
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/api/teacher/reservation/delete", method = RequestMethod.DELETE, produces = APPLICATION_JSON)
	public ApiResponse deleteReservation(@RequestBody List<HashMap> requestParams) {
		return memberResrvService.deleteReservation(requestParams);
	}
	
}
