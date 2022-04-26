package co.micol.prj.listTest;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.dto.StudentVO;

//웹만들때 유용하게 쓰임
public class MapTest {
	public void mapTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("address", "대구광역시");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("address"));
	}
	
	public void studentMap() {
		//Map구조는 (K,V)로 구성되어있어서 특정값을 K에 담을때 유용하다
		//HashMap구조와 Propoties?가 유명하다
		Map<Integer, StudentVO> map = new HashMap<Integer, StudentVO>();
		//int가 아닌 Integer 객체를 써야 에러가 안나옴
		map.put(1,new StudentVO());
		map.put(2,new StudentVO("박승리"));
		
		System.out.println(map.get(1));
	}
}
