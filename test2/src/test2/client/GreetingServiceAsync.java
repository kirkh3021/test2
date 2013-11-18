package test2.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * kirk was here The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
