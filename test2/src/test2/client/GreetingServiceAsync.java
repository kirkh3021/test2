package test2.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Final kirk push on 11/18 The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
