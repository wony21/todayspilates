package m.todays.pilates.domain.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List getUser() {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.getUser();
		
	}
	
	public Boolean loginUser(String userCd, String userPs) {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("userCd", userCd);
		parameter.put("userPs", userPs);
		List userInfo = userMapper.loginUser(parameter);
		return userInfo.size() > 0;
	}
	
	public User getUserInfo(String userCd, String userPs) {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("userCd", userCd);
		parameter.put("userPs", userPs);
		User userInfo = userMapper.getUserInfo(parameter);
		return userInfo;
	}
	
}
