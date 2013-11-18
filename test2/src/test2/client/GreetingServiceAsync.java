package test2.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
<<<<<<< HEAD
 * Final kirk push on 11/18 The async counterpart of <code>GreetingService</code>.
=======
 * V1 Push - kirk was here The async counterpart of <code>GreetingService</code>.
>>>>>>> refs/heads/v1.0
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
