<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<h2>�� ����Ʈ</h2>
<table class="list">
	<tr>
		<th>�󿵹�ȣ</th>
		<th>��ȭ�ڵ�</th>
		<th>�󿵰��ڵ�</th>
		<th>�����̸�</th>
		<th>�󿵰��̸�</th>
		<th>��ȸ��</th>
		<th>�󿵻���</th>
	</tr>
	<c:forEach var="showviewlist" items="${showviewlist}">
		<tr class="record">
			<td>${showviewlist.sh_code}</td>
			<td>${showviewlist.mv_code}</td>
			<td>${showviewlist.sr_code}</td>
			<td>${showviewlist.th_name}</td>
			<td>${showviewlist.sr_name}</td>
			<td>${showviewlist.showtime}</td>
			<td>${showviewlist.sh_status}</td>
		</tr>
	</c:forEach>
</table>



<%@ include file="../footer.jsp" %>