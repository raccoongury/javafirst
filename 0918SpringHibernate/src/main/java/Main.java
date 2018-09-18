import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pk.dao.GoodDao;
import com.pk.domain.Good;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext(
					"classpath:applicationContext.xml");
		GoodDao dao = context.getBean(GoodDao.class);
		//Good good = new Good();
		
		
//삽입
/*		good.setCode(7);
		good.setName("감귤");
		good.setManufacture("제주도");
		good.setPrice(700);
		
		dao.insertGood(good);
*/

//수정
/*		good.setCode(7);
		good.setName("무화과");
		good.setManufacture("목포");
		good.setPrice(3000);
		
		dao.updateGood(good);
*/		

//삭제
/*		good.setCode(7);
		dao.deleteGood(good);
*/	


		List<Good>list = dao.list();
		for(Good good : list) {
			System.out.println(good);
		}
		
		//데이터 1개 가져오기
		System.out.println("=========");
		System.out.println(dao.get(11));
		System.out.println(dao.get(12));
		
		
		context.close();
	}

}
