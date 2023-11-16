package com.vandenbreemen.kissues.provider

import com.vandenbreemen.kissues.model.Issue

/**
 * Repository for fetching issues
 * @param   Criteria    Type of criteria used when querying issues
 */
interface IssuesRepository<Criteria> {

    /**
     * Query for issues using the specified criteria
     */
    suspend fun queryIssues(criteria: Criteria): List<Issue>

}