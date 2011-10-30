package net.qmsource.android.cvut.kos.auth;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

/**
 * kos-auth-android library
 * @author Tonda Novak (http://qmsource.net/), 2011
 *
 */

public class KosHttpClient extends DefaultHttpClient {
	
	public KosHttpClient(ClientConnectionManager cman, HttpParams params, String username, String password) {
		super(cman, params);
		
		CredentialsProvider credProvider = new BasicCredentialsProvider();
	    credProvider.setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT), new UsernamePasswordCredentials(username, password));
	   
	    super.setCredentialsProvider(credProvider);
		
	}
	
	public KosHttpClient(String username, String password) {
		super();
		
		CredentialsProvider credProvider = new BasicCredentialsProvider();
	    credProvider.setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT), new UsernamePasswordCredentials(username, password));
	   
	    super.setCredentialsProvider(credProvider);
		
	}

}
