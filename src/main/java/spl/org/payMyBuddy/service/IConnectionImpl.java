package spl.org.payMyBuddy.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spl.org.payMyBuddy.dao.ConnectionRepository;
import spl.org.payMyBuddy.entity.Connection;
import spl.org.payMyBuddy.entity.User;

@Service
@Transactional
public class IConnectionImpl implements IConnection {

	@Autowired
	private ConnectionRepository connectionRepository;

	@Override
	public Connection addConnection(String label, User connection, User user) {
		List<Connection> listConnectionByUserConnection = (List<Connection>) user.getConnections();
		List<User> usersConnection = new ArrayList<User>();
		Connection newConnection = new Connection();
		boolean isNewConnection = false;
		listConnectionByUserConnection.forEach(con -> {
			usersConnection.add(con.getConnection());
		});
		for (int i = 0; i < usersConnection.size(); i++) {
			if (usersConnection.get(i).getEmail() == connection.getEmail()) {
				isNewConnection = true;
			}
		}
		if (!isNewConnection) {
			newConnection = new Connection(label, connection, user);
			connectionRepository.save(newConnection);
		}
		return newConnection;
	}

	@Override
	public Connection getConnectionById(Long connection_id) {
		// TODO Auto-generated method stub
		Connection getConnection = new Connection();
		try {
			getConnection = connectionRepository.getById(connection_id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return getConnection;
	}

}
