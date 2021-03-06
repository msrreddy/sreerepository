/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for JobTitle. This utility wraps
 * {@link com.rknowsys.eapp.hrm.service.impl.JobTitleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author rknowsys
 * @see JobTitleLocalService
 * @see com.rknowsys.eapp.hrm.service.base.JobTitleLocalServiceBaseImpl
 * @see com.rknowsys.eapp.hrm.service.impl.JobTitleLocalServiceImpl
 * @generated
 */
public class JobTitleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rknowsys.eapp.hrm.service.impl.JobTitleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the job title to the database. Also notifies the appropriate model listeners.
	*
	* @param jobTitle the job title
	* @return the job title that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.JobTitle addJobTitle(
		com.rknowsys.eapp.hrm.model.JobTitle jobTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addJobTitle(jobTitle);
	}

	/**
	* Creates a new job title with the primary key. Does not add the job title to the database.
	*
	* @param jobTitleId the primary key for the new job title
	* @return the new job title
	*/
	public static com.rknowsys.eapp.hrm.model.JobTitle createJobTitle(
		long jobTitleId) {
		return getService().createJobTitle(jobTitleId);
	}

	/**
	* Deletes the job title with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobTitleId the primary key of the job title
	* @return the job title that was removed
	* @throws PortalException if a job title with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.JobTitle deleteJobTitle(
		long jobTitleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteJobTitle(jobTitleId);
	}

	/**
	* Deletes the job title from the database. Also notifies the appropriate model listeners.
	*
	* @param jobTitle the job title
	* @return the job title that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.JobTitle deleteJobTitle(
		com.rknowsys.eapp.hrm.model.JobTitle jobTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteJobTitle(jobTitle);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.JobTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.JobTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.rknowsys.eapp.hrm.model.JobTitle fetchJobTitle(
		long jobTitleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchJobTitle(jobTitleId);
	}

	/**
	* Returns the job title with the primary key.
	*
	* @param jobTitleId the primary key of the job title
	* @return the job title
	* @throws PortalException if a job title with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.JobTitle getJobTitle(
		long jobTitleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobTitle(jobTitleId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the job titles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.JobTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job titles
	* @param end the upper bound of the range of job titles (not inclusive)
	* @return the range of job titles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.JobTitle> getJobTitles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobTitles(start, end);
	}

	/**
	* Returns the number of job titles.
	*
	* @return the number of job titles
	* @throws SystemException if a system exception occurred
	*/
	public static int getJobTitlesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobTitlesCount();
	}

	/**
	* Updates the job title in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobTitle the job title
	* @return the job title that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.JobTitle updateJobTitle(
		com.rknowsys.eapp.hrm.model.JobTitle jobTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateJobTitle(jobTitle);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLeaveTypeApplicabilityJobTitle(
		long leaveTypeApplicabilityId, long jobTitleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLeaveTypeApplicabilityJobTitle(leaveTypeApplicabilityId,
			jobTitleId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLeaveTypeApplicabilityJobTitle(
		long leaveTypeApplicabilityId,
		com.rknowsys.eapp.hrm.model.JobTitle jobTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLeaveTypeApplicabilityJobTitle(leaveTypeApplicabilityId,
			jobTitle);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId, long[] jobTitleIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId,
			jobTitleIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId,
		java.util.List<com.rknowsys.eapp.hrm.model.JobTitle> JobTitles)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId,
			JobTitles);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.clearLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLeaveTypeApplicabilityJobTitle(
		long leaveTypeApplicabilityId, long jobTitleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLeaveTypeApplicabilityJobTitle(leaveTypeApplicabilityId,
			jobTitleId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLeaveTypeApplicabilityJobTitle(
		long leaveTypeApplicabilityId,
		com.rknowsys.eapp.hrm.model.JobTitle jobTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLeaveTypeApplicabilityJobTitle(leaveTypeApplicabilityId,
			jobTitle);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId, long[] jobTitleIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId,
			jobTitleIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId,
		java.util.List<com.rknowsys.eapp.hrm.model.JobTitle> JobTitles)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId,
			JobTitles);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.JobTitle> getLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.JobTitle> getLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.JobTitle> getLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLeaveTypeApplicabilityJobTitlesCount(
		long leaveTypeApplicabilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLeaveTypeApplicabilityJobTitlesCount(leaveTypeApplicabilityId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLeaveTypeApplicabilityJobTitle(
		long leaveTypeApplicabilityId, long jobTitleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLeaveTypeApplicabilityJobTitle(leaveTypeApplicabilityId,
			jobTitleId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLeaveTypeApplicabilityJobTitles(
		long leaveTypeApplicabilityId, long[] jobTitleIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setLeaveTypeApplicabilityJobTitles(leaveTypeApplicabilityId,
			jobTitleIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static JobTitleLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					JobTitleLocalService.class.getName());

			if (invokableLocalService instanceof JobTitleLocalService) {
				_service = (JobTitleLocalService)invokableLocalService;
			}
			else {
				_service = new JobTitleLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(JobTitleLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(JobTitleLocalService service) {
	}

	private static JobTitleLocalService _service;
}