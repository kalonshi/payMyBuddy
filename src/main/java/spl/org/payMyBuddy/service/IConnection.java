package spl.org.payMyBuddy.service;

import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.User;

public interface IConnection {
public Connection addConnection(String label, User connection, User user);
public Connection getConnectionById(Long connection_id);

}
