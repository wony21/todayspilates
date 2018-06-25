package m.todays.pilates.domain.lesson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import m.todays.pilates.common.BaseService;
import m.todays.pilates.common.ParamNames;

@Service
public class LessionService extends BaseService {
	
	public List getTeacher(String compCd, String storCd) {
		LessonMapper mapper = sqlSession.getMapper(LessonMapper.class);
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put(ParamNames.compCd, compCd);
		parameter.put(ParamNames.storCd, storCd);
		return mapper.getLesson(parameter);
	}

}
