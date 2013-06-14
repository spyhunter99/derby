/*

   Derby - Class org.apache.derby.client.am.PreparedStatement40

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.apache.derby.client.am;

import java.sql.NClob;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import org.apache.derby.client.ClientPooledConnection;

public class  PreparedStatement40 extends  org.apache.derby.client.am.PreparedStatement{

    /**
     * The PreparedStatement used for JDBC 4 positioned update statements.
     * Called by material statement constructors.
     * It has the ClientPooledConnection as one of its parameters 
     * this is used to raise the Statement Events when the prepared
     * statement is closed
     *
     * @param agent The instance of NetAgent associated with this
     *              CallableStatement object.
     * @param connection The connection object associated with this
     *                   PreparedStatement Object.
     * @param sql        A String object that is the SQL statement to be sent
     *                   to the database.
     * @param section    Section
     * @param cpc The ClientPooledConnection wraps the underlying physical
     *            connection associated with this prepared statement.
     *            It is used to pass the Statement closed and the Statement
     *            error occurred events that occur back to the
     *            ClientPooledConnection.
     * @throws SqlException
     */
    public PreparedStatement40(Agent agent,
        Connection connection,
        String sql,
        Section section,ClientPooledConnection cpc) throws SqlException {
        super(agent, connection,sql,section,cpc);
    }
    
    /**
     * The PreparedStatementConstructor used for jdbc 4 prepared statements 
     * with scroll attributes. Called by material statement constructors.
     * It has the ClientPooledConnection as one of its parameters 
     * this is used to raise the Statement Events when the prepared
     * statement is closed
     *
    * @param agent The instance of NetAgent associated with this
     *              CallableStatement object.
     * @param connection  The connection object associated with this
     *                    PreparedStatement Object.
     * @param sql         A String object that is the SQL statement
     *                    to be sent to the database.
     * @param type        One of the ResultSet type constants.
     * @param concurrency One of the ResultSet concurrency constants.
     * @param holdability One of the ResultSet holdability constants.
     * @param autoGeneratedKeys a flag indicating whether auto-generated
     *                          keys should be returned.
     * @param columnNames an array of column names indicating the columns that
     *                    should be returned from the inserted row or rows.
     * @param columnIndexes an array of column indexes indicating the columns
     *                  that should be returned from the inserted row.                   
     * @param cpc The ClientPooledConnection wraps the underlying physical
     *            connection associated with this prepared statement
     *            it is used to pass the Statement closed and the Statement
     *            error occurred events that occur back to the
     *            ClientPooledConnection.
     * @throws SqlException
     */
    public PreparedStatement40(Agent agent,
        Connection connection,
        String sql,
        int type, int concurrency, int holdability, int autoGeneratedKeys, 
        String[] columnNames, int[] columnIndexes, ClientPooledConnection cpc) throws SqlException {
        super(agent, connection, sql, type, concurrency, holdability, autoGeneratedKeys,
                columnNames, columnIndexes, cpc);
    }
    
    public void setRowId(int parameterIndex, RowId x) throws SQLException{
        throw SQLExceptionFactory.notImplemented ("setRowId (int, RowId)");
    }
    
    public void setNClob(int index, NClob value) throws SQLException{
        throw SQLExceptionFactory.notImplemented ("setNClob (int, NClob)");
    }
    
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) 
                throws SQLException{
        throw SQLExceptionFactory.notImplemented ("setSQLXML (int, SQLXML)");
    }
}