package com.linecorp.kotlinjdsl.query.clause.orderby

import com.linecorp.kotlinjdsl.query.spec.Froms
import jakarta.persistence.criteria.CriteriaBuilder
import jakarta.persistence.criteria.CriteriaQuery

/**
 * Internal Only
 * Don't use this directly because it's an **INTERNAL**.
 * It does not support backward compatibility.
 */
interface CriteriaQueryOrderByClause {
    fun apply(froms: Froms, query: CriteriaQuery<*>, criteriaBuilder: CriteriaBuilder)
}
