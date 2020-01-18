package com.kite.mm.member.domain;

import java.util.List;

//멤버 리스트에 관련된 데이터를 표현하는 도메인 클래스
public class MemberListView {

	// 멤버의 리스트
	private List<MemberRequest> memberList;

	// 전체 멤버의 수
	private int totalMemberCount;

	// 전체 멤버 페이지의 개수
	private int totalMemberPageCount;

	// 현재 멤버 페이지
	private int currentMemberPageNo;

	// 시작 멤버의 번호
	private int startMemberRow;

	// 멤버 페이지 표현할 멤버의 개수
	private int countPerMemberPage;


	public MemberListView(List<MemberRequest> memberList, int totalMemberCount, int currentMemberPageNo,
			int startMemberRow, int countPerMemberPage) {
		super();
		this.memberList = memberList;
		this.totalMemberCount = totalMemberCount;
		this.currentMemberPageNo = currentMemberPageNo;
		this.startMemberRow = startMemberRow;
		this.countPerMemberPage = countPerMemberPage;
		makeTotalMemberpageCount();
	}

	//getter만 생성하였다.

	public List<MemberRequest> getMemberList() {
		return memberList;
	}

	public int getTotalMemberCount() {
		return totalMemberCount;
	}

	public int getTotalMemberPageCount() {
		return totalMemberPageCount;
	}

	public int getCurrentMemberPageNo() {
		return currentMemberPageNo;
	}

	public int getStartMemberRow() {
		return startMemberRow;
	}

	public int getCountPerMemberPage() {
		return countPerMemberPage;
	}


	

	@Override
	public String toString() {
		return "MemberListView [memberList=" + memberList + ", totalMemberCount=" + totalMemberCount
				+ ", totalMemberPageCount=" + totalMemberPageCount + ", currentMemberPageNo=" + currentMemberPageNo
				+ ", startMemberRow=" + startMemberRow + ", countPerMemberPage=" + countPerMemberPage + "]";
	}

	// 멤버 페이지의 개수를 구하는 메서드
	// 객체 생성 후 생성자 호출되는 메서드
	private void makeTotalMemberpageCount() {

		// 멤버 페이지 개수
		int mCnt = 0;

		// 멤버 페이지 개수 = 전체 멤버  개수 / 멤버 페이지 1장에 넣을 멤버의 개수
		mCnt = totalMemberCount / countPerMemberPage;

		totalMemberPageCount = totalMemberCount % countPerMemberPage > 0 ? ++mCnt : mCnt;

	}

}
