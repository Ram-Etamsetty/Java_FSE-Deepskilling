import React from "react";

function ListOfPlayers() {
  const players = [
    { name: "Virat Kohli", score: 90 },
    { name: "Rohit Sharma", score: 82 },
    { name: "Shubman Gill", score: 65 },
    { name: "KL Rahul", score: 72 },
    { name: "Hardik Pandya", score: 55 },
    { name: "Ravindra Jadeja", score: 80 },
    { name: "Rishabh Pant", score: 69 },
    { name: "Mohammed Shami", score: 45 },
    { name: "Jasprit Bumrah", score: 77 },
    { name: "Kuldeep Yadav", score: 60 },
    { name: "Mohammed Siraj", score: 74 },
  ];

  const lowScorers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>

      {players.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}

      <h2>Players with Scores Below 70</h2>

      {lowScorers.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}
    </div>
  );
}

export default ListOfPlayers;
