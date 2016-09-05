package test.mapper;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;

//import com.aok.b2b.member.dao.MemberMapper;
//import com.aok.b2b.member.entity.Member;

public class MemberMapperTest {

	private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    
    static {
        try {
            reader = Resources.getResourceAsReader("conf/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }
	
    //@Test
	public void insert(){
		SqlSession session=getSession();
		try{
//			MemberMapper memberMapper=session.getMapper(MemberMapper.class);
//			Member record=new Member();
//			record.setUsername("用户001");
//			record.setPassword("123456");
//			memberMapper.insert(record);
//			session.commit();
//			System.out.println("新增用户ID:"+record.getId());
//			System.out.println("-----------------------");
//			
//			Member m=memberMapper.find(60L);
//			System.out.println("m:"+m);
//			System.out.println("-----------------------");
//			
//			
//			Map params=new HashMap();
//			params.put("username", "用户001");
//			int count=memberMapper.count(params);
//			System.out.println("count:"+count);
//			System.out.println("-----------------------");
//			
//			memberMapper.delete(60L);
//			session.commit();
//			System.out.println("delete:"+"60");
//			System.out.println("-----------------------");
//			
//			params=new HashMap();
//			params.put("username", "abcdef_t");
//			memberMapper.deleteBy(params);
//			session.commit();
//			System.out.println("deleteby:"+"61");
//			System.out.println("-----------------------");
//			
//			Member member=memberMapper.find(62L);
//			System.out.println("find:"+member.getUsername());
//			System.out.println("-----------------------");
//			
//			record=new Member();
//			record.setUsername("用户001");
//			record.setPassword("123456");
//			memberMapper.insert(record);
//			session.commit();
//			System.out.println("insert:"+record.getId());
//			System.out.println("-----------------------");
//			
//			record=new Member();
//			record.setUsername("用户001");
//			record.setPassword("123456");
//			memberMapper.insertNotNull(record);
//			System.out.println("insertNotNull:"+record.getId());
//			System.out.println("-----------------------");
//			
//			params=new HashMap();
//			params.put("username", "用户001");
//			params.put("orderByClause","id desc,username asc");
//			List list=memberMapper.list(params);
//			System.out.println("list:"+list.size());
//			
//			record=new Member();
//			record.setId(64L);
//			record.setUsername("用户001");
//			memberMapper.update(record);
//			session.commit();
//			System.out.println("update:"+record.getId());
//			System.out.println("-----------------------");
//			
//			record=new Member();
//			record.setId(65L);
//			record.setPassword("用户001");
//			record.setPassword("用户001password");
//			
//			params=new HashMap();
//			params.put("username", "用户0011");
//			memberMapper.updateBy(record, params);
//			session.commit();
//			System.out.println("updateBy:用户001");
//			System.out.println("-----------------------");
//			
//			memberMapper.updateByNotNull(record, params);
//			session.commit();
//			System.out.println("updateByNotNull:"+record.getId());
//			
//			System.out.println("-----------------------");
//			memberMapper.updateNotNull(record);
//			session.commit();
//			System.out.println("updateNotNull:"+record.getId());
		}finally{
			session.close();
		}
	}
}
