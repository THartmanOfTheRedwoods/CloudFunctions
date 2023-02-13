package edu.redwoods.gcp;

import java.io.Serial;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryTest implements Serializable
{

    @SerializedName("query")
    @Expose
    private String query;
    @Serial
    private final static long serialVersionUID = 4137733264114796811L;

    /**
     * No args constructor for use in serialization
     *
     */
    public QueryTest() {
    }

    public QueryTest(String query) {
        super();
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QueryTest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof QueryTest rhs)) {
            return false;
        }
        return this.query.equals(rhs.query);
    }

}