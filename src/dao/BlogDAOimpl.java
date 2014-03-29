package dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Blog;

/**
 	* A data access object (DAO) providing persistence and search support for Blog entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see entity.Blog
  * @author MyEclipse Persistence Tools 
 */

public class BlogDAOimpl extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(BlogDAOimpl.class);
		//property constants
	public static final String USER_ID = "userId";
	public static final String TITLE = "title";
	public static final String PATH = "path";
	public static final String ABSTRACT_ = "abstract_";
	public static final String REPLY_COUNT = "replyCount";
	public static final String VIEW_COUNT = "viewCount";



	protected void initDao() {
		//do nothing
	}
    
    public void save(Blog transientInstance) {
        log.debug("saving Blog instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Blog persistentInstance) {
        log.debug("deleting Blog instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Blog findById( java.lang.Integer id) {
        log.debug("getting Blog instance with id: " + id);
        try {
            Blog instance = (Blog) getHibernateTemplate()
                    .get("entity.Blog", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Blog instance) {
        log.debug("finding Blog instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Blog instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Blog as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	
	public List findByPath(Object path
	) {
		return findByProperty(PATH, path
		);
	}
	
	public List findByAbstract_(Object abstract_
	) {
		return findByProperty(ABSTRACT_, abstract_
		);
	}
	
	public List findByReplyCount(Object replyCount
	) {
		return findByProperty(REPLY_COUNT, replyCount
		);
	}
	
	public List findByViewCount(Object viewCount
	) {
		return findByProperty(VIEW_COUNT, viewCount
		);
	}
	

	public List findAll() {
		log.debug("finding all Blog instances");
		try {
			String queryString = "from Blog";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Blog merge(Blog detachedInstance) {
        log.debug("merging Blog instance");
        try {
            Blog result = (Blog) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Blog instance) {
        log.debug("attaching dirty Blog instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Blog instance) {
        log.debug("attaching clean Blog instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static BlogDAOimpl getFromApplicationContext(ApplicationContext ctx) {
    	return (BlogDAOimpl) ctx.getBean("BlogDAO");
	}
}