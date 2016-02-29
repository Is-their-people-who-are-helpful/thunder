package network.thunder.core.communication.nio;

/**
 * Created by matsjerratsch on 22/01/2016.
 */
public interface ConnectionManager {
    void startUp () throws Exception;

    void startListening ();

    void fetchNetworkIPs ();

    void startBuildingRandomChannel ();

    void buildChannel (byte[] nodeKey);
}
