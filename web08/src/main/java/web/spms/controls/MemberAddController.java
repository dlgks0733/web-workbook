package web.spms.controls;

import java.util.Map;

import web.spms.bind.DataBinding;
import web.spms.dao.MemberDAO;
import web.spms.vo.Member;

@org.springframework.stereotype.Controller("/member/add.do")
public class MemberAddController implements Controller, DataBinding {

	MemberDAO memberDAO;
	
	public MemberAddController setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
	}
	
	@Override
	public String excute(Map<String, Object> model) throws Exception {
		Member member = (Member)model.get("member");
		
		if(member.getEmail() == null) {
			return "/member/MemberForm.jsp";
		} else {
			memberDAO.insert(member);
			return "redirect:list.do";
		}
		
	}

	@Override
	public Object[] getDataBinders() {
		return new Object[] {
				"member", Member.class
		};
	}

}
