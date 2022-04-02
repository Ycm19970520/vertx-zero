/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XTag;
import cn.vertxup.ambient.domain.tables.records.XTagRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTagDao extends AbstractVertxDAO<XTagRecord, cn.vertxup.ambient.domain.tables.pojos.XTag, String, Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>>, Future<cn.vertxup.ambient.domain.tables.pojos.XTag>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XTagRecord,cn.vertxup.ambient.domain.tables.pojos.XTag,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public XTagDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(XTag.X_TAG, cn.vertxup.ambient.domain.tables.pojos.XTag.class, new JDBCClassicQueryExecutor<XTagRecord,cn.vertxup.ambient.domain.tables.pojos.XTag,String>(configuration,cn.vertxup.ambient.domain.tables.pojos.XTag.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.ambient.domain.tables.pojos.XTag object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByName(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByType(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByIcon(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.ICON.in(values));
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByIcon(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.ICON.in(values),limit);
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyBySort(Collection<Long> values) {
                return findManyByCondition(XTag.X_TAG.SORT.in(values));
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyBySort(Collection<Long> values, int limit) {
                return findManyByCondition(XTag.X_TAG.SORT.in(values),limit);
        }

        /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByDescription(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.DESCRIPTION.in(values));
        }

        /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByDescription(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.DESCRIPTION.in(values),limit);
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByAppId(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.APP_ID.in(values));
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByAppId(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.APP_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(XTag.X_TAG.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(XTag.X_TAG.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XTag.X_TAG.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XTag.X_TAG.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XTag.X_TAG.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XTag.X_TAG.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(XTag.X_TAG.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XTag>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XTag.X_TAG.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<XTagRecord,cn.vertxup.ambient.domain.tables.pojos.XTag,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<XTagRecord,cn.vertxup.ambient.domain.tables.pojos.XTag,String>) super.queryExecutor();
        }
}
