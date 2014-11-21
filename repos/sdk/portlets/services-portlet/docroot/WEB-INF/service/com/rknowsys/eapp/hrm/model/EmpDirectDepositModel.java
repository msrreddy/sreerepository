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

import java.util.Date;

/**
 * The base model interface for the EmpDirectDeposit service. Represents a row in the &quot;emp_direct_deposit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.EmpDirectDepositModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.EmpDirectDepositImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpDirectDeposit
 * @see com.rknowsys.eapp.hrm.model.impl.EmpDirectDepositImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmpDirectDepositModelImpl
 * @generated
 */
public interface EmpDirectDepositModel extends BaseModel<EmpDirectDeposit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emp direct deposit model instance should use the {@link EmpDirectDeposit} interface instead.
	 */

	/**
	 * Returns the primary key of this emp direct deposit.
	 *
	 * @return the primary key of this emp direct deposit
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emp direct deposit.
	 *
	 * @param primaryKey the primary key of this emp direct deposit
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the emp direct deposit ID of this emp direct deposit.
	 *
	 * @return the emp direct deposit ID of this emp direct deposit
	 */
	public long getEmpDirectDepositId();

	/**
	 * Sets the emp direct deposit ID of this emp direct deposit.
	 *
	 * @param empDirectDepositId the emp direct deposit ID of this emp direct deposit
	 */
	public void setEmpDirectDepositId(long empDirectDepositId);

	/**
	 * Returns the employee ID of this emp direct deposit.
	 *
	 * @return the employee ID of this emp direct deposit
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this emp direct deposit.
	 *
	 * @param employeeId the employee ID of this emp direct deposit
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the group ID of this emp direct deposit.
	 *
	 * @return the group ID of this emp direct deposit
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this emp direct deposit.
	 *
	 * @param groupId the group ID of this emp direct deposit
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this emp direct deposit.
	 *
	 * @return the company ID of this emp direct deposit
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this emp direct deposit.
	 *
	 * @param companyId the company ID of this emp direct deposit
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this emp direct deposit.
	 *
	 * @return the create date of this emp direct deposit
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this emp direct deposit.
	 *
	 * @param createDate the create date of this emp direct deposit
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this emp direct deposit.
	 *
	 * @return the modified date of this emp direct deposit
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this emp direct deposit.
	 *
	 * @param modifiedDate the modified date of this emp direct deposit
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this emp direct deposit.
	 *
	 * @return the user ID of this emp direct deposit
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this emp direct deposit.
	 *
	 * @param userId the user ID of this emp direct deposit
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this emp direct deposit.
	 *
	 * @return the user uuid of this emp direct deposit
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this emp direct deposit.
	 *
	 * @param userUuid the user uuid of this emp direct deposit
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the amount of this emp direct deposit.
	 *
	 * @return the amount of this emp direct deposit
	 */
	public long getAmount();

	/**
	 * Sets the amount of this emp direct deposit.
	 *
	 * @param amount the amount of this emp direct deposit
	 */
	public void setAmount(long amount);

	/**
	 * Returns the account number of this emp direct deposit.
	 *
	 * @return the account number of this emp direct deposit
	 */
	public long getAccountNumber();

	/**
	 * Sets the account number of this emp direct deposit.
	 *
	 * @param accountNumber the account number of this emp direct deposit
	 */
	public void setAccountNumber(long accountNumber);

	/**
	 * Returns the bank name of this emp direct deposit.
	 *
	 * @return the bank name of this emp direct deposit
	 */
	@AutoEscape
	public String getBankName();

	/**
	 * Sets the bank name of this emp direct deposit.
	 *
	 * @param bankName the bank name of this emp direct deposit
	 */
	public void setBankName(String bankName);

	/**
	 * Returns the account type of this emp direct deposit.
	 *
	 * @return the account type of this emp direct deposit
	 */
	@AutoEscape
	public String getAccountType();

	/**
	 * Sets the account type of this emp direct deposit.
	 *
	 * @param accountType the account type of this emp direct deposit
	 */
	public void setAccountType(String accountType);

	/**
	 * Returns the branch location of this emp direct deposit.
	 *
	 * @return the branch location of this emp direct deposit
	 */
	@AutoEscape
	public String getBranchLocation();

	/**
	 * Sets the branch location of this emp direct deposit.
	 *
	 * @param branchLocation the branch location of this emp direct deposit
	 */
	public void setBranchLocation(String branchLocation);

	/**
	 * Returns the routing number of this emp direct deposit.
	 *
	 * @return the routing number of this emp direct deposit
	 */
	@AutoEscape
	public String getRoutingNumber();

	/**
	 * Sets the routing number of this emp direct deposit.
	 *
	 * @param routingNumber the routing number of this emp direct deposit
	 */
	public void setRoutingNumber(String routingNumber);

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
	public int compareTo(EmpDirectDeposit empDirectDeposit);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpDirectDeposit> toCacheModel();

	@Override
	public EmpDirectDeposit toEscapedModel();

	@Override
	public EmpDirectDeposit toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}