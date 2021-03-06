package com.rknowsys.eapp;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rknowsys.eapp.hrm.model.Interview;
import com.rknowsys.eapp.hrm.service.InterviewLocalServiceUtil;

public class InterviewAction extends MVCPortlet {
	
	
	Date date = new Date();
	private static Log log = LogFactoryUtil.getLog(InterviewAction.class);

	/**
	 * <p>
	 * This method inserts new interview record in database if the id is not
	 * exits, otherwise updates the record based on the record id
	 * </p>
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 * @throws SystemException
	 */
	public void saveInterview(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, SystemException {
		log.info("inside saveInterview...");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		log.info("company Id == " + themeDisplay.getCompanyId());
		log.info("userId = " + themeDisplay.getUserId());
		log.info("groupId = " + themeDisplay.getCompanyGroupId());
		try {
			
			
			log.info("id = "
					+ ParamUtil.getString(actionRequest, "interviewId"));
			log.info("name = "
					+ ParamUtil.getString(actionRequest, "name"));
			String id = ParamUtil.getString(actionRequest, "interviewId");
			log.info("id == " + id);
			if (id == "" || id == null) {
				log.info("inside if loop...");
				Interview interview =  InterviewLocalServiceUtil.createInterview(CounterLocalServiceUtil.increment());
				interview.setName(ParamUtil.getString(actionRequest,
						"name"));
				interview.setCreateDate(date);
				interview.setModifiedDate(date);
				interview.setCompanyId(themeDisplay.getCompanyId());
				interview.setGroupId(themeDisplay.getCompanyGroupId());
				interview.setUserId(themeDisplay.getUserId());
				log.info("before...");
				interview = InterviewLocalServiceUtil.addInterview(interview); 
				log.info("end of if block");
			} else {
				
				log.info("else block to update....");

				long interviewid = Long.parseLong(id);

				Interview interview1 = InterviewLocalServiceUtil.getInterview(interviewid);

				interview1.setInterviewId(ParamUtil.getLong(actionRequest,
						"interviewId"));

				interview1.setName(ParamUtil.getString(actionRequest,
						"name"));
				interview1.setModifiedDate(date);
				interview1.setCompanyId(themeDisplay.getCompanyId());
				interview1.setGroupId(themeDisplay.getCompanyGroupId());
				interview1.setUserId(themeDisplay.getUserId());

				interview1 = InterviewLocalServiceUtil.updateInterview(interview1);
				log.info("end of else block");

			}
		} catch (SystemException e) {
			
			e.printStackTrace();
		    log.info("system exception");
		} catch (PortalException e) {

			e.printStackTrace();
			log.info("portalexception");
		}
		System.out.println("end of the saveInterview method");
		log.info("end of the saveInterview method");

	}

	/**
	 * <p>
	 * This method deletes the interview record from database based on
	 * interview record Id
	 * </p>
	 * 
	 * @param resourceRequest
	 * @param resourceResponse
	 * @throws IOException
	 * @throws PortletException
	 * @throws SystemException
	 * @throws PortalException
	 * @throws NumberFormatException
	 */
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,NumberFormatException
           {
		if (resourceRequest.getResourceID().equals("deleteInterview")) {

			log.info("inside deleteInterview... serveResource");
			Interview interview;
			try {
				interview = InterviewLocalServiceUtil.createInterview(CounterLocalServiceUtil.increment());
			} catch (SystemException e1) {

				e1.printStackTrace();
			}
			String[] idsArray = ParamUtil.getParameterValues(resourceRequest,
					"interviewIds");
		
			log.info("idsArray== " + idsArray.length);
			for (int i = 0; i <= idsArray.length - 1; i++) {
				
				log.info("ids == " +idsArray[i]);

			}
			for (int i = 0; i <= idsArray.length - 1; i++) {
				log.info("id == " +idsArray[i]);
				if (idsArray[i].equals("on")) {
					log.info("All records selected...");
				} else {
					try {
						interview = InterviewLocalServiceUtil.deleteInterview(Long.parseLong(idsArray[i]));
						log.info("end of try block in delete...");
					} catch (PortalException e) {

						e.printStackTrace();
						log.info("portal exception...");
					} catch (SystemException e) {

						e.printStackTrace();
						log.info("system exception...");
						
					}
				}
				
			}
			log.info("end of for loop..");
			
		}
		
		log.info("end of deleteInterview method...");

	}

	/**
	 * <p>
	 * This method gets the single interview record from database based on the
	 * given interview Id
	 * </p>
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 * @return Single interview record
	 * @throws SystemException
	 * @throws PortalException
	 * @throws NumberFormatException
	 */
	public void editInterview(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, NumberFormatException, PortalException,
			SystemException {
		log.info("inside editInterview...");
		String s = ParamUtil.getString(actionRequest, "id");
		log.info("id == " + s);
		Interview interview =  InterviewLocalServiceUtil.getInterview(Long.parseLong(s));

		log.info(interview.getInterviewId());
		log.info(interview.getName());
		PortletSession portletSession = actionRequest.getPortletSession();
		portletSession.setAttribute("editinterview", interview);
		actionResponse.setRenderParameter("jspPage",
				"/html/Interview/edit.jsp");
	}

}
