package web.spms.controls;

import java.util.HashMap;
import java.util.Map;

import web.spms.bind.DataBinding;
import web.spms.dao.MemberDAO;

@org.springframework.stereotype.Controller("/member/list.do")
public class MemberListController implements Controller, DataBinding {

	MemberDAO memberDAO;
	
	public MemberListController setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
	}
	

	@Override
	public String excute(Map<String, Object> model) throws Exception {
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("orderCond", model.get("orderCond"));
		
		System.out.println(model.toString());
		
		model.put("members", memberDAO.selectList(paramMap));
		

		return "/member/MemberList.jsp";
	}


	@Override
	public Object[] getDataBinders() {

		return new Object[] {
				"orderCond", String.class
		};
	}

}
