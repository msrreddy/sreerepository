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

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroups;
import com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroupsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LeaveTypeEmployeeGroups service. Represents a row in the &quot;leave_type_employee_groups&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroupsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaveTypeEmployeeGroupsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeaveTypeEmployeeGroupsImpl
 * @see com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroups
 * @see com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroupsModel
 * @generated
 */
public class LeaveTypeEmployeeGroupsModelImpl extends BaseModelImpl<LeaveTypeEmployeeGroups>
	implements LeaveTypeEmployeeGroupsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave type employee groups model instance should use the {@link com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroups} interface instead.
	 */
	public static final String TABLE_NAME = "leave_type_employee_groups";
	public static final Object[][] TABLE_COLUMNS = {
			{ "leaveTypeEmployeeGroupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "leaveTypeId", Types.BIGINT },
			{ "groupName", Types.VARCHAR },
			{ "forJobTitles", Types.BOOLEAN },
			{ "forJobCategories", Types.BOOLEAN },
			{ "forEmploymentStatus", Types.BOOLEAN },
			{ "forGender", Types.BOOLEAN },
			{ "forFemale", Types.BOOLEAN },
			{ "forMale", Types.BOOLEAN },
			{ "forYearsOfService", Types.BOOLEAN },
			{ "fromYears", Types.VARCHAR },
			{ "toYears", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table leave_type_employee_groups (leaveTypeEmployeeGroupId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,leaveTypeId LONG,groupName VARCHAR(75) null,forJobTitles BOOLEAN,forJobCategories BOOLEAN,forEmploymentStatus BOOLEAN,forGender BOOLEAN,forFemale BOOLEAN,forMale BOOLEAN,forYearsOfService BOOLEAN,fromYears VARCHAR(75) null,toYears VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table leave_type_employee_groups";
	public static final String ORDER_BY_JPQL = " ORDER BY leaveTypeEmployeeGroups.leaveTypeEmployeeGroupId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY leave_type_employee_groups.leaveTypeEmployeeGroupId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroups"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroups"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroups"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long LEAVETYPEID_COLUMN_BITMASK = 2L;
	public static long LEAVETYPEEMPLOYEEGROUPID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroups"));

	public LeaveTypeEmployeeGroupsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _leaveTypeEmployeeGroupId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLeaveTypeEmployeeGroupId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leaveTypeEmployeeGroupId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LeaveTypeEmployeeGroups.class;
	}

	@Override
	public String getModelClassName() {
		return LeaveTypeEmployeeGroups.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("leaveTypeEmployeeGroupId", getLeaveTypeEmployeeGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("leaveTypeId", getLeaveTypeId());
		attributes.put("groupName", getGroupName());
		attributes.put("forJobTitles", getForJobTitles());
		attributes.put("forJobCategories", getForJobCategories());
		attributes.put("forEmploymentStatus", getForEmploymentStatus());
		attributes.put("forGender", getForGender());
		attributes.put("forFemale", getForFemale());
		attributes.put("forMale", getForMale());
		attributes.put("forYearsOfService", getForYearsOfService());
		attributes.put("fromYears", getFromYears());
		attributes.put("toYears", getToYears());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long leaveTypeEmployeeGroupId = (Long)attributes.get(
				"leaveTypeEmployeeGroupId");

		if (leaveTypeEmployeeGroupId != null) {
			setLeaveTypeEmployeeGroupId(leaveTypeEmployeeGroupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long leaveTypeId = (Long)attributes.get("leaveTypeId");

		if (leaveTypeId != null) {
			setLeaveTypeId(leaveTypeId);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		Boolean forJobTitles = (Boolean)attributes.get("forJobTitles");

		if (forJobTitles != null) {
			setForJobTitles(forJobTitles);
		}

		Boolean forJobCategories = (Boolean)attributes.get("forJobCategories");

		if (forJobCategories != null) {
			setForJobCategories(forJobCategories);
		}

		Boolean forEmploymentStatus = (Boolean)attributes.get(
				"forEmploymentStatus");

		if (forEmploymentStatus != null) {
			setForEmploymentStatus(forEmploymentStatus);
		}

		Boolean forGender = (Boolean)attributes.get("forGender");

		if (forGender != null) {
			setForGender(forGender);
		}

		Boolean forFemale = (Boolean)attributes.get("forFemale");

		if (forFemale != null) {
			setForFemale(forFemale);
		}

		Boolean forMale = (Boolean)attributes.get("forMale");

		if (forMale != null) {
			setForMale(forMale);
		}

		Boolean forYearsOfService = (Boolean)attributes.get("forYearsOfService");

		if (forYearsOfService != null) {
			setForYearsOfService(forYearsOfService);
		}

		String fromYears = (String)attributes.get("fromYears");

		if (fromYears != null) {
			setFromYears(fromYears);
		}

		String toYears = (String)attributes.get("toYears");

		if (toYears != null) {
			setToYears(toYears);
		}
	}

	@Override
	public long getLeaveTypeEmployeeGroupId() {
		return _leaveTypeEmployeeGroupId;
	}

	@Override
	public void setLeaveTypeEmployeeGroupId(long leaveTypeEmployeeGroupId) {
		_leaveTypeEmployeeGroupId = leaveTypeEmployeeGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getLeaveTypeId() {
		return _leaveTypeId;
	}

	@Override
	public void setLeaveTypeId(long leaveTypeId) {
		_columnBitmask |= LEAVETYPEID_COLUMN_BITMASK;

		if (!_setOriginalLeaveTypeId) {
			_setOriginalLeaveTypeId = true;

			_originalLeaveTypeId = _leaveTypeId;
		}

		_leaveTypeId = leaveTypeId;
	}

	public long getOriginalLeaveTypeId() {
		return _originalLeaveTypeId;
	}

	@Override
	public String getGroupName() {
		if (_groupName == null) {
			return StringPool.BLANK;
		}
		else {
			return _groupName;
		}
	}

	@Override
	public void setGroupName(String groupName) {
		_groupName = groupName;
	}

	@Override
	public boolean getForJobTitles() {
		return _forJobTitles;
	}

	@Override
	public boolean isForJobTitles() {
		return _forJobTitles;
	}

	@Override
	public void setForJobTitles(boolean forJobTitles) {
		_forJobTitles = forJobTitles;
	}

	@Override
	public boolean getForJobCategories() {
		return _forJobCategories;
	}

	@Override
	public boolean isForJobCategories() {
		return _forJobCategories;
	}

	@Override
	public void setForJobCategories(boolean forJobCategories) {
		_forJobCategories = forJobCategories;
	}

	@Override
	public boolean getForEmploymentStatus() {
		return _forEmploymentStatus;
	}

	@Override
	public boolean isForEmploymentStatus() {
		return _forEmploymentStatus;
	}

	@Override
	public void setForEmploymentStatus(boolean forEmploymentStatus) {
		_forEmploymentStatus = forEmploymentStatus;
	}

	@Override
	public boolean getForGender() {
		return _forGender;
	}

	@Override
	public boolean isForGender() {
		return _forGender;
	}

	@Override
	public void setForGender(boolean forGender) {
		_forGender = forGender;
	}

	@Override
	public boolean getForFemale() {
		return _forFemale;
	}

	@Override
	public boolean isForFemale() {
		return _forFemale;
	}

	@Override
	public void setForFemale(boolean forFemale) {
		_forFemale = forFemale;
	}

	@Override
	public boolean getForMale() {
		return _forMale;
	}

	@Override
	public boolean isForMale() {
		return _forMale;
	}

	@Override
	public void setForMale(boolean forMale) {
		_forMale = forMale;
	}

	@Override
	public boolean getForYearsOfService() {
		return _forYearsOfService;
	}

	@Override
	public boolean isForYearsOfService() {
		return _forYearsOfService;
	}

	@Override
	public void setForYearsOfService(boolean forYearsOfService) {
		_forYearsOfService = forYearsOfService;
	}

	@Override
	public String getFromYears() {
		if (_fromYears == null) {
			return StringPool.BLANK;
		}
		else {
			return _fromYears;
		}
	}

	@Override
	public void setFromYears(String fromYears) {
		_fromYears = fromYears;
	}

	@Override
	public String getToYears() {
		if (_toYears == null) {
			return StringPool.BLANK;
		}
		else {
			return _toYears;
		}
	}

	@Override
	public void setToYears(String toYears) {
		_toYears = toYears;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LeaveTypeEmployeeGroups.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LeaveTypeEmployeeGroups toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeaveTypeEmployeeGroups)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeaveTypeEmployeeGroupsImpl leaveTypeEmployeeGroupsImpl = new LeaveTypeEmployeeGroupsImpl();

		leaveTypeEmployeeGroupsImpl.setLeaveTypeEmployeeGroupId(getLeaveTypeEmployeeGroupId());
		leaveTypeEmployeeGroupsImpl.setCompanyId(getCompanyId());
		leaveTypeEmployeeGroupsImpl.setGroupId(getGroupId());
		leaveTypeEmployeeGroupsImpl.setCreateDate(getCreateDate());
		leaveTypeEmployeeGroupsImpl.setModifiedDate(getModifiedDate());
		leaveTypeEmployeeGroupsImpl.setUserId(getUserId());
		leaveTypeEmployeeGroupsImpl.setLeaveTypeId(getLeaveTypeId());
		leaveTypeEmployeeGroupsImpl.setGroupName(getGroupName());
		leaveTypeEmployeeGroupsImpl.setForJobTitles(getForJobTitles());
		leaveTypeEmployeeGroupsImpl.setForJobCategories(getForJobCategories());
		leaveTypeEmployeeGroupsImpl.setForEmploymentStatus(getForEmploymentStatus());
		leaveTypeEmployeeGroupsImpl.setForGender(getForGender());
		leaveTypeEmployeeGroupsImpl.setForFemale(getForFemale());
		leaveTypeEmployeeGroupsImpl.setForMale(getForMale());
		leaveTypeEmployeeGroupsImpl.setForYearsOfService(getForYearsOfService());
		leaveTypeEmployeeGroupsImpl.setFromYears(getFromYears());
		leaveTypeEmployeeGroupsImpl.setToYears(getToYears());

		leaveTypeEmployeeGroupsImpl.resetOriginalValues();

		return leaveTypeEmployeeGroupsImpl;
	}

	@Override
	public int compareTo(LeaveTypeEmployeeGroups leaveTypeEmployeeGroups) {
		long primaryKey = leaveTypeEmployeeGroups.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaveTypeEmployeeGroups)) {
			return false;
		}

		LeaveTypeEmployeeGroups leaveTypeEmployeeGroups = (LeaveTypeEmployeeGroups)obj;

		long primaryKey = leaveTypeEmployeeGroups.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		LeaveTypeEmployeeGroupsModelImpl leaveTypeEmployeeGroupsModelImpl = this;

		leaveTypeEmployeeGroupsModelImpl._originalGroupId = leaveTypeEmployeeGroupsModelImpl._groupId;

		leaveTypeEmployeeGroupsModelImpl._setOriginalGroupId = false;

		leaveTypeEmployeeGroupsModelImpl._originalLeaveTypeId = leaveTypeEmployeeGroupsModelImpl._leaveTypeId;

		leaveTypeEmployeeGroupsModelImpl._setOriginalLeaveTypeId = false;

		leaveTypeEmployeeGroupsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LeaveTypeEmployeeGroups> toCacheModel() {
		LeaveTypeEmployeeGroupsCacheModel leaveTypeEmployeeGroupsCacheModel = new LeaveTypeEmployeeGroupsCacheModel();

		leaveTypeEmployeeGroupsCacheModel.leaveTypeEmployeeGroupId = getLeaveTypeEmployeeGroupId();

		leaveTypeEmployeeGroupsCacheModel.companyId = getCompanyId();

		leaveTypeEmployeeGroupsCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			leaveTypeEmployeeGroupsCacheModel.createDate = createDate.getTime();
		}
		else {
			leaveTypeEmployeeGroupsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			leaveTypeEmployeeGroupsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			leaveTypeEmployeeGroupsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		leaveTypeEmployeeGroupsCacheModel.userId = getUserId();

		leaveTypeEmployeeGroupsCacheModel.leaveTypeId = getLeaveTypeId();

		leaveTypeEmployeeGroupsCacheModel.groupName = getGroupName();

		String groupName = leaveTypeEmployeeGroupsCacheModel.groupName;

		if ((groupName != null) && (groupName.length() == 0)) {
			leaveTypeEmployeeGroupsCacheModel.groupName = null;
		}

		leaveTypeEmployeeGroupsCacheModel.forJobTitles = getForJobTitles();

		leaveTypeEmployeeGroupsCacheModel.forJobCategories = getForJobCategories();

		leaveTypeEmployeeGroupsCacheModel.forEmploymentStatus = getForEmploymentStatus();

		leaveTypeEmployeeGroupsCacheModel.forGender = getForGender();

		leaveTypeEmployeeGroupsCacheModel.forFemale = getForFemale();

		leaveTypeEmployeeGroupsCacheModel.forMale = getForMale();

		leaveTypeEmployeeGroupsCacheModel.forYearsOfService = getForYearsOfService();

		leaveTypeEmployeeGroupsCacheModel.fromYears = getFromYears();

		String fromYears = leaveTypeEmployeeGroupsCacheModel.fromYears;

		if ((fromYears != null) && (fromYears.length() == 0)) {
			leaveTypeEmployeeGroupsCacheModel.fromYears = null;
		}

		leaveTypeEmployeeGroupsCacheModel.toYears = getToYears();

		String toYears = leaveTypeEmployeeGroupsCacheModel.toYears;

		if ((toYears != null) && (toYears.length() == 0)) {
			leaveTypeEmployeeGroupsCacheModel.toYears = null;
		}

		return leaveTypeEmployeeGroupsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{leaveTypeEmployeeGroupId=");
		sb.append(getLeaveTypeEmployeeGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", leaveTypeId=");
		sb.append(getLeaveTypeId());
		sb.append(", groupName=");
		sb.append(getGroupName());
		sb.append(", forJobTitles=");
		sb.append(getForJobTitles());
		sb.append(", forJobCategories=");
		sb.append(getForJobCategories());
		sb.append(", forEmploymentStatus=");
		sb.append(getForEmploymentStatus());
		sb.append(", forGender=");
		sb.append(getForGender());
		sb.append(", forFemale=");
		sb.append(getForFemale());
		sb.append(", forMale=");
		sb.append(getForMale());
		sb.append(", forYearsOfService=");
		sb.append(getForYearsOfService());
		sb.append(", fromYears=");
		sb.append(getFromYears());
		sb.append(", toYears=");
		sb.append(getToYears());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.LeaveTypeEmployeeGroups");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>leaveTypeEmployeeGroupId</column-name><column-value><![CDATA[");
		sb.append(getLeaveTypeEmployeeGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaveTypeId</column-name><column-value><![CDATA[");
		sb.append(getLeaveTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupName</column-name><column-value><![CDATA[");
		sb.append(getGroupName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forJobTitles</column-name><column-value><![CDATA[");
		sb.append(getForJobTitles());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forJobCategories</column-name><column-value><![CDATA[");
		sb.append(getForJobCategories());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forEmploymentStatus</column-name><column-value><![CDATA[");
		sb.append(getForEmploymentStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forGender</column-name><column-value><![CDATA[");
		sb.append(getForGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forFemale</column-name><column-value><![CDATA[");
		sb.append(getForFemale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forMale</column-name><column-value><![CDATA[");
		sb.append(getForMale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forYearsOfService</column-name><column-value><![CDATA[");
		sb.append(getForYearsOfService());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromYears</column-name><column-value><![CDATA[");
		sb.append(getFromYears());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toYears</column-name><column-value><![CDATA[");
		sb.append(getToYears());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeaveTypeEmployeeGroups.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeaveTypeEmployeeGroups.class
		};
	private long _leaveTypeEmployeeGroupId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private long _leaveTypeId;
	private long _originalLeaveTypeId;
	private boolean _setOriginalLeaveTypeId;
	private String _groupName;
	private boolean _forJobTitles;
	private boolean _forJobCategories;
	private boolean _forEmploymentStatus;
	private boolean _forGender;
	private boolean _forFemale;
	private boolean _forMale;
	private boolean _forYearsOfService;
	private String _fromYears;
	private String _toYears;
	private long _columnBitmask;
	private LeaveTypeEmployeeGroups _escapedModel;
}