package com.acorn.day2.문제풀이;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex04Controller {
	
	@RequestMapping(value = "/ex04", method = RequestMethod.GET)
	public String ex04(Model model, 
			@RequestParam(defaultValue ="guest") String name) {
		Random random=new Random();
		LocalDate today=LocalDate.now();
		
		int todayLuck=random.nextInt(10);
		String luckText;
		
		switch (todayLuck) {
	    case 1:  luckText = "작은 기회가 행운으로 이어지는 하루입니다."; break;
	    case 2:  luckText = "마음이 편안해지고 여유가 깊어지는 하루입니다."; break;
	    case 3:  luckText = "뜻밖의 좋은 소식이 찾아오는 길한 하루입니다."; break;
	    case 4:  luckText = "노력의 결실이 드러나는 보람찬 하루입니다."; break;
	    case 5:  luckText = "잠시 쉬어갈수록 더 큰 행운이 쌓이는 하루입니다."; break;
	    case 6:  luckText = "당신의 선택이 빛을 발하는 자신감 넘치는 하루입니다."; break;
	    case 7:  luckText = "소중한 사람에게 따뜻한 힘을 얻는 하루입니다."; break;
	    case 8:  luckText = "당신의 매력이 돋보이며 인연이 다가오는 하루입니다."; break;
	    case 9:  luckText = "행운과 기회가 동시에 열리는 특별한 하루입니다."; break;
	    case 10: luckText = "바라던 일이 한 걸음 더 가까워지는 희망의 하루입니다."; break;

	    default:
	        luckText = "정해진 운명 따윈 없지만, 어떤 어려움도 극복하며 나아가는 용기의 하루";
	        break;
	}

		
		model.addAttribute("name", name);
		model.addAttribute("today", today);
		model.addAttribute("luckText", luckText);
		
		return "ex04";
	}

}
