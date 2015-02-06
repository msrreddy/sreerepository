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

package com.rknowsys.eapp.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rknowsys.eapp.hrm.model.BulkUpdate;

import java.util.List;

/**
 * The persistence utility for the bulk update service. This utility wraps {@link BulkUpdatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author rknowsys
 * @see BulkUpdatePersistence
 * @see BulkUpdatePersistenceImpl
 * @generated
 */
public class BulkUpdateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(BulkUpdate bulkUpdate) {
		getPersistence().clearCache(bulkUpdate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BulkUpdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BulkUpdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BulkUpdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BulkUpdate update(BulkUpdate bulkUpdate)
		throws SystemException {
		return getPersistence().update(bulkUpdate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BulkUpdate update(BulkUpdate bulkUpdate,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(bulkUpdate, serviceContext);
	}

	/**
	* Caches the bulk update in the entity cache if it is enabled.
	*
	* @param bulkUpdate the bulk update
	*/
	public static void cacheResult(
		com.rknowsys.eapp.hrm.model.BulkUpdate bulkUpdate) {
		getPersistence().cacheResult(bulkUpdate);
	}

	/**
	* Caches the bulk updates in the entity cache if it is enabled.
	*
	* @param bulkUpdates the bulk updates
	*/
	public static void cacheResult(
		java.util.List<com.rknowsys.eapp.hrm.model.BulkUpdate> bulkUpdates) {
		getPersistence().cacheResult(bulkUpdates);
	}

	/**
	* Creates a new bulk update with the primary key. Does not add the bulk update to the database.
	*
	* @param bulkupdateId the primary key for the new bulk update
	* @return the new bulk update
	*/
	public static com.rknowsys.eapp.hrm.model.BulkUpdate create(
		long bulkupdateId) {
		return getPersistence().create(bulkupdateId);
	}

	/**
	* Removes the bulk update with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bulkupdateId the primary key of the bulk update
	* @return the bulk update that was removed
	* @throws com.rknowsys.eapp.hrm.NoSuchBulkUpdateException if a bulk update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.BulkUpdate remove(
		long bulkupdateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rknowsys.eapp.hrm.NoSuchBulkUpdateException {
		return getPersistence().remove(bulkupdateId);
	}

	public static com.rknowsys.eapp.hrm.model.BulkUpdate updateImpl(
		com.rknowsys.eapp.hrm.model.BulkUpdate bulkUpdate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(bulkUpdate);
	}

	/**
	* Returns the bulk update with the primary key or throws a {@link com.rknowsys.eapp.hrm.NoSuchBulkUpdateException} if it could not be found.
	*
	* @param bulkupdateId the primary key of the bulk update
	* @return the bulk update
	* @throws com.rknowsys.eapp.hrm.NoSuchBulkUpdateException if a bulk update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.BulkUpdate findByPrimaryKey(
		long bulkupdateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rknowsys.eapp.hrm.NoSuchBulkUpdateException {
		return getPersistence().findByPrimaryKey(bulkupdateId);
	}

	/**
	* Returns the bulk update with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bulkupdateId the primary key of the bulk update
	* @return the bulk update, or <code>null</code> if a bulk update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rknowsys.eapp.hrm.model.BulkUpdate fetchByPrimaryKey(
		long bulkupdateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(bulkupdateId);
	}

	/**
	* Returns all the bulk updates.
	*
	* @return the bulk updates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.BulkUpdate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bulk updates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.BulkUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bulk updates
	* @param end the upper bound of the range of bulk updates (not inclusive)
	* @return the range of bulk updates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.BulkUpdate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bulk updates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.BulkUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bulk updates
	* @param end the upper bound of the range of bulk updates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bulk updates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rknowsys.eapp.hrm.model.BulkUpdate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the bulk updates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bulk updates.
	*
	* @return the number of bulk updates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BulkUpdatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BulkUpdatePersistence)PortletBeanLocatorUtil.locate(com.rknowsys.eapp.hrm.service.ClpSerializer.getServletContextName(),
					BulkUpdatePersistence.class.getName());

			ReferenceRegistry.registerReference(BulkUpdateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BulkUpdatePersistence persistence) {
	}

	private static BulkUpdatePersistence _persistence;
}