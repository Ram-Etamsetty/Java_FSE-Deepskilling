import React from "react";

function IndianPlayers() {
  const team = [
    "Virat Kohli",
    "Rohit Sharma",
    "Shubman Gill",
    "KL Rahul",
    "Hardik Pandya",
    "Ravindra Jadeja",
    "Rishabh Pant",
    "Mohammed Shami",
    "Jasprit Bumrah",
    "Kuldeep Yadav",
    "Mohammed Siraj",
  ];
  const [p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11] = team;
  const oddPlayers = [p1, p3, p5, p7, p9, p11];
  const evenPlayers = [p2, p4, p6, p8, p10];
  const T20players = ["Virat Kohli", "Rohit Sharma", "Suryakumar Yadav"];
  const RanjiPlayers = ["Pujara", "Rahane", "Sarfaraz"];
  const mergedPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>

      {oddPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}

      <h2>Even Team Players</h2>

      {evenPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}

      <h2>Merged Players</h2>

      {mergedPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}
    </div>
  );
}

export default IndianPlayers;
