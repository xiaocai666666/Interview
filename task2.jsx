/* 
要将这个React类组件转换为功能组件，需要以下几步：
1.删除构造函数和this.state，以及componentDidMount，componentDidUpdate和componentWillUnmount生命周期方法。
2.使用useState钩子来替代状态。
3.使用useEffect钩子来替代componentDidMount和componentDidUpdate。
4.返回 JSX 结构，并在函数组件中使用user和seconds状态变量。
*/

import React, { useState, useEffect } from 'react';

const UserData = ({ userId }) => 
{
  const [user, setUser] = useState(null);
  const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    fetchUserData();
    const intervalId = setInterval(() => {
      setSeconds(prevSeconds => prevSeconds + 1);
    }, 1000);

    return () => clearInterval(intervalId);
  }, [userId]);

  const fetchUserData = () => {
    fetch(`https://localhost:8080/user/${userId}`)
      .then(response => response.json())
      .then(data => setUser(data))
      .catch(error => console.error('Error fetching user data:', error));
  };

  return (
    <div>
      <h1>User Data Component</h1>
      {user ? (
        <div>
          <p>Name: {user.name}</p>
          <p>Email: {user.email}</p>
        </div>
      ) : (
        <p>Loading user data...</p>
      )}
      <p>Timer: {seconds} seconds</p>
    </div>
  );
};

export default UserData;
