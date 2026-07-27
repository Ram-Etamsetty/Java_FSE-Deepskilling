import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";


const books = [
    {
      id: 101,
      bname: "React Beginner Friendly",
      price: 670,
    },
    {
      id: 102,
      bname: "Deep Dive into React",
      price: 800,
    },
    {
      id: 103,
      bname: "Mongo Essentials",
      price: 450,
    }
];

const blogs = [
  {
    id: 1,
    title: "React Learning",
    author: "Joe",
    content: "Welcome to learning React!",
  },
  {
    id: 2,
    title: "Installation",
    author: "Technoblade",
    content: "You can install React from npm.",
  }
];

const courses = [
  {
    id: 1,
    cname: "Angular",
    date: "4/5/2026",
  },
  {
    id: 2,
    cname: "React",
    date: "6/3/2026",
  }
];
function App() {
  let choice = "courses";
  if (choice === "book") {
    return <BookDetails books={books} />;
  } else if (choice === "blog") {
    return <BlogDetails blogs={blogs} />;
  } else {
    return <CourseDetails courses={courses} />;
  }
}

export default App;