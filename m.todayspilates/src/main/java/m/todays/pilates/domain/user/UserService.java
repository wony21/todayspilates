package m.todays.pilates.domain.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class UserService {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List getUser() {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.getUser();
	}
	
}
