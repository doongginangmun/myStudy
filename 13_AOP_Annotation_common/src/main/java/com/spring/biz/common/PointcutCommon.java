package com.spring.biz.common;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutCommon {
	//포인트컷 작성 : 명칭은 메소드명 사용
	@Pointcut("execution(* com.spring.biz..*Impl.*(..))") //Impl로 끝나는 클래스
	public void allPointcut() {}
	
	@Pointcut("execution(* com.spring.biz..*Impl.get*(..))") //Impl로끝나는 클래스 get으로 시작하는 메서드
	public void getPointcut() {}	
	
	@Pointcut("execution(* com.spring.biz..*Impl.update*(..))")
	public void updatePointcut() {}
}





