<%@ include file="/html/leavetype/init.jsp"%>
<portlet:actionURL name="addOrUpdateLeaveType" var="saveLeaveType"></portlet:actionURL>
<div class="panel">
	<div class="panel-heading">
		<h3>Leave Type</h3>
	</div>
	<div class="panel-body">
		<aui:form name="myForm" action="<%=saveLeaveType.toString()%>">
			<div class="span12">
				<div class="span2">
					<label>Country *</label>
				</div>
				<div class="span3">
					<aui:select type="select" name="nationalityId" label="">
						<aui:option value="0" selected="true">--Select--</aui:option>
						
						<%List<Nationality> nationalities = NationalityLocalServiceUtil
								.getNationalities(-1, -1);
						
							Iterator<Nationality> nationality = nationalities.iterator();
							while (nationality.hasNext()) {
								Nationality leaveTypeNationality = nationality.next(); %>
						<aui:option 
							value="<%=leaveTypeNationality.getNationalityId() %>">
							<%=leaveTypeNationality.getName() %>
						</aui:option>
						<% } %>
						
					</aui:select>
				</div>
			</div>

			<div class="span12">
				<div class="span2">
					<label>Name</label>
				</div>
				<div class="span3">

					<aui:input name="leaveTypeName" type="text" label=""
						/>
				</div>
			</div>


			<div class="span12">
				<div class="span2">
					<label>Is entitlement situational</label>
				</div>
				<div class="span3">
					<aui:input name="isSituational" type="checkbox" label=""
						/>
				</div>
			</div>

			<div class="span12">
				<aui:button type="submit" id="save" value="save" />
			</div>

		</aui:form>
	</div>
</div>