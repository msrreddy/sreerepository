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

package com.rknowsys.eapp.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.sql.Blob;

import java.util.Date;

/**
 * The base model interface for the EmpJob service. Represents a row in the &quot;emp_job&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.EmpJobModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.EmpJobImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpJob
 * @see com.rknowsys.eapp.hrm.model.impl.EmpJobImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmpJobModelImpl
 * @generated
 */
public interface EmpJobModel extends BaseModel<EmpJob> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emp job model instance should use the {@link EmpJob} interface instead.
	 */

	/**
	 * Returns the primary key of this emp job.
	 *
	 * @return the primary key of this emp job
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emp job.
	 *
	 * @param primaryKey the primary key of this emp job
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the emp job ID of this emp job.
	 *
	 * @return the emp job ID of this emp job
	 */
	public long getEmpJobId();

	/**
	 * Sets the emp job ID of this emp job.
	 *
	 * @param empJobId the emp job ID of this emp job
	 */
	public void setEmpJobId(long empJobId);

	/**
	 * Returns the employee ID of this emp job.
	 *
	 * @return the employee ID of this emp job
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this emp job.
	 *
	 * @param employeeId the employee ID of this emp job
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the group ID of this emp job.
	 *
	 * @return the group ID of this emp job
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this emp job.
	 *
	 * @param groupId the group ID of this emp job
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this emp job.
	 *
	 * @return the company ID of this emp job
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this emp job.
	 *
	 * @param companyId the company ID of this emp job
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this emp job.
	 *
	 * @return the create date of this emp job
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this emp job.
	 *
	 * @param createDate the create date of this emp job
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this emp job.
	 *
	 * @return the modified date of this emp job
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this emp job.
	 *
	 * @param modifiedDate the modified date of this emp job
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this emp job.
	 *
	 * @return the user ID of this emp job
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this emp job.
	 *
	 * @param userId the user ID of this emp job
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this emp job.
	 *
	 * @return the user uuid of this emp job
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this emp job.
	 *
	 * @param userUuid the user uuid of this emp job
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the joined date of this emp job.
	 *
	 * @return the joined date of this emp job
	 */
	public Date getJoinedDate();

	/**
	 * Sets the joined date of this emp job.
	 *
	 * @param joinedDate the joined date of this emp job
	 */
	public void setJoinedDate(Date joinedDate);

	/**
	 * Returns the probation end date of this emp job.
	 *
	 * @return the probation end date of this emp job
	 */
	public Date getProbationEndDate();

	/**
	 * Sets the probation end date of this emp job.
	 *
	 * @param probationEndDate the probation end date of this emp job
	 */
	public void setProbationEndDate(Date probationEndDate);

	/**
	 * Returns the permanent date of this emp job.
	 *
	 * @return the permanent date of this emp job
	 */
	public Date getPermanentDate();

	/**
	 * Sets the permanent date of this emp job.
	 *
	 * @param permanentDate the permanent date of this emp job
	 */
	public void setPermanentDate(Date permanentDate);

	/**
	 * Returns the job title ID of this emp job.
	 *
	 * @return the job title ID of this emp job
	 */
	public long getJobTitleId();

	/**
	 * Sets the job title ID of this emp job.
	 *
	 * @param jobTitleId the job title ID of this emp job
	 */
	public void setJobTitleId(long jobTitleId);

	/**
	 * Returns the employment status ID of this emp job.
	 *
	 * @return the employment status ID of this emp job
	 */
	public long getEmploymentStatusId();

	/**
	 * Sets the employment status ID of this emp job.
	 *
	 * @param employmentStatusId the employment status ID of this emp job
	 */
	public void setEmploymentStatusId(long employmentStatusId);

	/**
	 * Returns the job category ID of this emp job.
	 *
	 * @return the job category ID of this emp job
	 */
	public long getJobCategoryId();

	/**
	 * Sets the job category ID of this emp job.
	 *
	 * @param jobCategoryId the job category ID of this emp job
	 */
	public void setJobCategoryId(long jobCategoryId);

	/**
	 * Returns the sub unit ID of this emp job.
	 *
	 * @return the sub unit ID of this emp job
	 */
	public long getSubUnitId();

	/**
	 * Sets the sub unit ID of this emp job.
	 *
	 * @param subUnitId the sub unit ID of this emp job
	 */
	public void setSubUnitId(long subUnitId);

	/**
	 * Returns the location ID of this emp job.
	 *
	 * @return the location ID of this emp job
	 */
	public long getLocationId();

	/**
	 * Sets the location ID of this emp job.
	 *
	 * @param locationId the location ID of this emp job
	 */
	public void setLocationId(long locationId);

	/**
	 * Returns the effective date of this emp job.
	 *
	 * @return the effective date of this emp job
	 */
	public Date getEffectiveDate();

	/**
	 * Sets the effective date of this emp job.
	 *
	 * @param effectiveDate the effective date of this emp job
	 */
	public void setEffectiveDate(Date effectiveDate);

	/**
	 * Returns the shift ID of this emp job.
	 *
	 * @return the shift ID of this emp job
	 */
	public long getShiftId();

	/**
	 * Sets the shift ID of this emp job.
	 *
	 * @param shiftId the shift ID of this emp job
	 */
	public void setShiftId(long shiftId);

	/**
	 * Returns the comments of this emp job.
	 *
	 * @return the comments of this emp job
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this emp job.
	 *
	 * @param comments the comments of this emp job
	 */
	public void setComments(String comments);

	/**
	 * Returns the is current job of this emp job.
	 *
	 * @return the is current job of this emp job
	 */
	public boolean getIsCurrentJob();

	/**
	 * Returns <code>true</code> if this emp job is is current job.
	 *
	 * @return <code>true</code> if this emp job is is current job; <code>false</code> otherwise
	 */
	public boolean isIsCurrentJob();

	/**
	 * Sets whether this emp job is is current job.
	 *
	 * @param isCurrentJob the is current job of this emp job
	 */
	public void setIsCurrentJob(boolean isCurrentJob);

	/**
	 * Returns the employment contract start date of this emp job.
	 *
	 * @return the employment contract start date of this emp job
	 */
	public Date getEmploymentContractStartDate();

	/**
	 * Sets the employment contract start date of this emp job.
	 *
	 * @param employmentContractStartDate the employment contract start date of this emp job
	 */
	public void setEmploymentContractStartDate(Date employmentContractStartDate);

	/**
	 * Returns the employment contract end date of this emp job.
	 *
	 * @return the employment contract end date of this emp job
	 */
	public Date getEmploymentContractEndDate();

	/**
	 * Sets the employment contract end date of this emp job.
	 *
	 * @param employmentContractEndDate the employment contract end date of this emp job
	 */
	public void setEmploymentContractEndDate(Date employmentContractEndDate);

	/**
	 * Returns the contract details of this emp job.
	 *
	 * @return the contract details of this emp job
	 */
	public Blob getContractDetails();

	/**
	 * Sets the contract details of this emp job.
	 *
	 * @param contractDetails the contract details of this emp job
	 */
	public void setContractDetails(Blob contractDetails);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(EmpJob empJob);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpJob> toCacheModel();

	@Override
	public EmpJob toEscapedModel();

	@Override
	public EmpJob toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}