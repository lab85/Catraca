package invent.to.catraca;

import android.content.Context;

public interface TurnstileController {
	public void start(Context context, TurnstileEventListener turnstileEventListener, String address, boolean aux);
	public void setAddress(String address);
	public boolean isConnected();
	public String getStatus();
	public void open(String name, TurnstileDirection direction);
	public void close();
}
