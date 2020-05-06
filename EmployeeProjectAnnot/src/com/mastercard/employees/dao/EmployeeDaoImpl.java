package com.mastercard.employees.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.entity.Employee1;
import com.mastercard.employees.service.EmployeeServiceImpl;

@Repository("employeeDao")
public class EmployeeDaoImpl extends CustomHibernateDaoSupport implements
		EmployeeDao {

	private static Logger log = Logger.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void deleteEmployee(final Integer empId) {

		Employee1 employee1 = getEmployee(empId);
		getHibernateTemplate().bulkUpdate(
				"update Employee e set e.manager.empId=null where e.manager.empId="
						+ empId);
	}

	@Override
	public Employee1 getEmployee(final Integer empId) {

		Employee1 employee1 = null;

		employee1 = getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session) {
				Employee1 employee1 = null;
				final Criteria criteria = session.createCriteria(
						Employee1.class).add(Restrictions.eq("empId", empId));
				employee1 = (Employee1) criteria.uniqueResult();
				return employee1;
			}
		});

		return employee1;
	}

	@Override
	public List<Employee1> getEmployees() {

		DetachedCriteria crit = DetachedCriteria.forClass(Employee1.class);
		crit.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
		return getHibernateTemplate().findByCriteria(crit);
	}

	@Override
	public Employee1 getManager(final Integer empId) {

		Employee1 employee1 = null;

		employee1 = getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session) {
				Employee1 employee1 = null;
				final Criteria criteria = session
						.createCriteria(Employee1.class)
						.add(
								Restrictions
										.eq(
												"empId",
												(Integer) (session
														.createCriteria(
																Employee1.class)
														.setProjection(
																Projections
																		.projectionList()
																		.add(
																				Projections
																						.property("manager.empId")))
														.add(Restrictions.eq(
																"empId", empId)))
														.uniqueResult()));

				employee1 = (Employee1) criteria.uniqueResult();
				return employee1;
			}
		});

		return employee1;
	}

	@Override
	public List<Employee1> getManagerReportees(Integer empId) {

		DetachedCriteria crit = DetachedCriteria.forClass(Employee1.class).add(
				Restrictions.eq("manager.empId", empId));
		crit.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
		return getHibernateTemplate().findByCriteria(crit);
	}

	@Override
	public void updateEmployee(Employee1 employee1) {

		HibernateTemplate hibernateTemplate = getHibernateTemplate();
		hibernateTemplate.saveOrUpdate(employee1);
		hibernateTemplate.flush();
		hibernateTemplate.evict(employee1);

	}

}
