package com.example.scatchdrmo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class ComputerSciencePage extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Computer Science Colloquium ", "The Computer and its Use I", "Computer Programming I",
            "Computer Programming II", "Introduction to Data Science", "Professional Development Seminar",
            "SAS Lab", "UNIX Lab", "BASIC Lab", "Internet Lab", "Introduction to Computer Software Systems",
            "Introduction to Computer Hardware Organization", "The Computer and its Use II", "Data Structures", "C&C++ Programming",
            "Computer Science Internship", "Special Topics in Computer Science—Level 3", "Operating Systems", "Computer Architecture",
            "Introduction to Information Security", "Analysis of Algorithms",
            "Fundamentals of Internet Systems", "Introduction to Numerical Analysis", "Algebraic Structures",
            "Computer Graphics", "Data Communications", "Principles of Database Management", "Applied Data Structures",
            "Introduction to Robotics", "Game Development",
            "Computer Science Co-Op", "Big Data and Cloud Computing Systems", "Parallel Computing", "Introduction to Cryptography", "Organization of Programming Languages",
            "Software Engineering", "Database Management Design and Development", "Web Programming", "Hardware and Media Security",
            "Web-based Database", "Introduction to Computational Modeling", "Advanced Computer Graphics", "System Simulation and Modeling",
            "Automata, Formal Languages, and Computability", "Seminar in Computer Science", "Systems Design and Development", "Computer Communication Networks",
            "Directed Study", "Artificial Intelligence", "Computer Science CO-OP"};
    String mDescription[] = {"CSC 1105  Prerequisites: Computer Science or Information Technology pre-major.", "CSC 1306  Prerequisites: None",
            "CSC 1310   Prerequisites: MAT 1311  with a C or higher or equivalent score on the placement test.  ","CSC 1311    Prerequisites:", "CSC 1315   Prerequisites: CSC 1310", "CSC 2131    Prerequisites: None", "CSC 2141    Prerequisites: Major or Pre-Major in Computer Science or Information Technology", "CSC 2160    Prerequisites: MAT 2326 or MAT 3310 ", "CSC 2181     Prerequisites: CSC 1311",
            "CSC 2184 Prerequisites: CSC 1311", "CSC 2310  Prerequisites: CSC 1311", "CSC 2320  Prerequisites: CSC 1311", "CSC 2330  Prerequisites: CSC 1306", "CSC 2331  Prerequisites: CSC 1311", " CSC 2350  Prerequisites: CSC 1311",
            "CSC 3130   Prerequisites: CSC 2184", "CSC 3131   Prerequisites: CSC 1311  and MAT 2316 ",
            "CSC 3321  Prerequisites:", "CSC 3322  Prerequisites:",
            "CSC 3325  Prerequisites: Approval of the department chair and admission to the major.",
            "CSC 3331  Prerequisites: CSC 2331", "CSC 3332  Prerequisites: CSC 2320", "CSC 3340  Prerequisites: CSC 3321", "CSC 3341  Prerequisites: CSC 2310",
            "CSC 3342 Prerequisites: MAT 2316  and MAT 2337 ",
            "CSC 3351 Prerequisites:  CSC 2331  and MAT 2317 , or permission of instructor.", "CSC 3355 Prerequisites: CSC 2320",
            " CSC 3371 Prerequisites: CSC 2320", "CSC 3380 Prerequisites: Admission to the Certificate Program and CSC 3361.", "CSC 3385 Prerequisites: CSC 2310",
            "CSC 3391 Prerequisites: CSC 2310 ", "CSC 3691 Prerequisites:Approval of the department chair and admission to the major.", "CSC 4001 Prerequisites:Approval of the student’s major department and the staff of Cooperative Education.", " CSC 4310 Prerequisites: Admission to the major and permission of the instructor and department chair.",
            "CSC 4322 Prerequisites:  CIT 3321 /CSC 3321 Operating Systems and CIT 3355 /CSC 3355 Database Management System", "CSC 4330 Prerequisites: CSC 3321",
            "CSC 4340 Prerequisites:  MAT 2337 or Permission of the Department Chairperson.\n", " CSC 4350 Prerequisites: CSC 2331.", "CSC 4355 Prerequisites: CSC 3321.", "CSC 4356 Prerequisites: CSC 3355.",
            "CSC 4360 Prerequisites: CSC 3332.",
            "CSC 4370 Prerequisites: CSC 3325 and MAT 2337.", "CSC 4383 Prerequisites:3355", "CSC 4384 Prerequisites: CSC 1311, Junior level in the students major, or permission of the department chair.",
            "CSC 4385 Prerequisites:CSC 3342 and MAT 2316.", "CSC 4386 Prerequisites: CSC 3321 and MAT 3310.",
            "CSC 4387 Prerequisites: CSC 3331 and MAT 2337, or consent of instructor.", " CSC 4388  Prerequisites:Senior standing, CSC 3321, and MAT 3310.",
            "CSC 4389 Prerequisites:CSC 3321, and senior standing.",
            "CSC 4390 Prerequisites:CSC 3351.", "CSC 4395 Prerequisites:Admission to the major, consent of the instructor and Department Chairperson.",
            "CSC 4691  Prerequisites:Approval of the student’s major department and the staff of Cooperative Education."};
    String mOverview[] ={"This course concentrates on strategies for success in computer science. The course concentrates on broadening students’ general knowledge of computer science as well as developing critical thinking and problem solving skills using current technologies and computing tools.",
"This course provides an introduction to the use of digital computers, applications software, and computer ethics. This course also provides exposure to information creation, location, evaluation and interpretation.  Laboratory sessions include extensive hands-on experience using word processing, database, spreadsheet, and other information resources in various fields of study.",
    "This course is an introduction to problem-solving methods and algorithm development. It includes program design, coding, debugging and documentation using a high-level language.",
    "This course offers continued development in program design. Larger program",
    "This course serves as an introduction to the interdisciplinary field of data science. It covers key aspects of data exploration, fundamental concepts of data computation and focused subject areas such as data visualization based on practical and intuitive approach. Students will acquire a working knowledge of data science through hands-on class work using open data sources from areas such as finance, healthcare and science. Topics to be covered include data collection, cleansing, integration, modeling, analysis, prediction and visualization.",
    "This course develops professional skills in computer science and information technology students.  Habitual and thoughtful use of ccommunication skills, liberal and technical knowledge skills, technical skills, and critical reasoning will be cultivated by the integration of accumulated knowledge and skills, interaction with professionals in the discipline, oral and written communication activities, and by promoting the development of practical professional experience via a team project, peer collaboration, self-directed learning, planning and management.  The course engages students in activities designed to prepare them to obtain internships, research experiences, co-op experiences and ultimately career positions.  The course may be repeated up to eight semesters, and students may earn up to six semester hours of academic credit.",
    "This course introduces students to statistical programming using SAS (Statistical Analysis System). Practical statistical, graphics, and data management problems will be solved.",
    "This course covers UNIX operating systems commands, the use of directories, files, text manipulation, and user-to-user communication.",
    "This course introduces students to BASIC and visual BASIC programming syntax.",
    "This laboratory course introduces students to Webpage development languages and tools. Students will learn mechanics, design aspects, and bandwidth conservancy. Projects will be required.",
    "This course provides an introduction to computer architecture, systems programs, machine organization, instructions, data representation, and addressing. Topics covered include assemblers, linkers, loaders, operating systems, and elementary assembler language programming.",
    "This course covers the organization and functional design of computer components such as the memory unit, arithmetic and logic unit and I/O devices. Other topics include data channels, interrupts, micro-programming, and design of simple combinatorial circuits.",
    "This course provides a continuation of Computer and Its Use, and expands the student’s abilities in the use of digital computers, applications software, information literacy, and computer ethics. More extensive exposure to information creation, determining types of information resources, evaluation of soucres and websites, and the interpretation of information is provided.  Laboratory sessions include extensive hands-on experience using Internet searches, word processing, database, spreadsheet, and other information resources in various fields of study.",
    "This course emphasizes data structures and the development and analysis of their associated algorithms. Specific data structures will include linear lists, arrays, trees, graphs, stacks, queues, and tables. Pointer variables and recursion will be used. Applications will include searching and sorting.",
    "This course provides an introduction to the Programming Language C&C++. Practical applications and special features of the language are emphasized. Laboratory work required.",
    "The internship in computer science is designed to provide students practical experience in the corporate or research computing environment. Computer Science internships are coordinated by the department and may be repeated.",
    "This course is a study of specific new areas emerging in computer science suitable for students at the junior level.",
    "This course is a study of the operating system. Topics include concepts of system structure, memory management, process management, and recovery procedures.",
    "This course focuses on design alternative in computer architecture. It covers instruction set architectures, memory subsystem organization, interfacing concepts, and interprocessor communication. Architectures to be studied will include data flow machines, vector and array processors, and pipeline architectures. Concepts related to parallel and distribution algorithms will also be studied.",
    "This course provides an essential introduction to the basics of information and computer security. Topics include information security goals and principles, access control, malicious software, basic applied cryptography, basic network security, and privacy issues in computing systems.",
    "This course covers the analysis and design of various algorithms using divide-and-conquer, greedy, backtracking, branch-and-bound, NP-hard, and NP- complete methods.",
    "This course addresses the structure and functionality of the Internet and software that exploits it. Topics include mark up languages, Web tools, static dynamic and active Web pages, multimedia in Web applications, communication protocols, client-server computing, scripting, group communication support, e-commerce, and security. Topics also include systems for organizing and coordinating work at different sites that exploit the Internet, and architectures to exploit the distributed computational power offered by the Internet.",
    "This course covers theory and application of algorithms for numerical computation, approximation, interpolation, numerical differentiation and integration, solution of linear, and ordinary differential equations.",
    "This course covers the basic algebraic properties of groups, rings, and fields.",
    "This course is a study of principles and techniques of interactive computer graphics, display processors and devices, graphics programming languages, and algorithms for managing graphics data.",
    "This course is an introduction to data communications. Topics include asynchronous and synchronous communication models, telephone switching systems, error detection, protocols, packet switching, information transmission systems, modulation systems, and computer network technology.",
    "This course covers concepts of logical and physical data structures, data security, and accuracy. It includes an overview of basic approaches to database organization and implementation and hands-on interaction with at least one hierarchical, network, or relational model database.",
    "This is an introduction to computer architecture and systems programs, machine organization, instructions, data representation, and addressing. Topics covered include assemblers, linkers, loaders, operating systems, and elementary assembler language programming.",
    "This course is an introduction to fundamental topics in autonomous robot control. It offers a hands-on introduction to robotics. . The course will present the basic concepts in robotics, such as sensors, actuators, and will describe the most important approaches to robot control. Students will have the opportunity to apply the concepts covered during the lectures in the laboratory sessions, by developing controllers and programs for various robotic tasks. The class will have a lecture and a laboratory component.",
    "The goal of this course is to introduce students with the basic elements of game development and game design. This course will emphasize 2D game development. Programming assignments are an integral part of the course. Students will work in groups for the final project to design, develop, test and deliver 2D games. Topics include (but not limited to) video game history, game structure, Artificial Intelligence, Collision Detection techniques, user input and sound effects.",
    "This course is designed for students for whom a half-time work experience is more appropriate. In such cases, students will usually be enrolled in courses other than Cooperative Education at the university part-time while involved in a work/learning experience for 20 hours per week. Procedures for approvals of placement and credits toward graduation are the same as for 3691 and 4691.",
    "Offers students an opportunity to prepare for their chosen careers by combining academic theory and actual work experience. The work experience is to be full-time paid work for approximately 15 weeks. The Cooperative Education staff, the employer, the student and the student’s major department must agree on the employment terms and the learning experience to be gained. The academic grade (A, B, C, D, F) is the responsibility of the student’s major department, with due consideration given to the employer’s evaluation of the student. The student may enroll in this course in two non- consecutive semesters for a total of 12 credit hours. Six hours can count toward the student’s computer science requirements.",
    "This course is a study of specific new areas emerging in computer science. May be repeated for up to 6 semester hours.",
    "This course covers the basics of big data and cloud computing tools and techniques and provides hands-on programming experience with Hadoop/Spark framework.",
    "This specific course is an introduction to the practical and theoretical foundations of parallel processing. Topics include data and control parallelism, the PRAM of parallel computation, parallel processor organizations, parallel programming languages and paradigms, scheduling, and a variety of parallel algorithms. Laboratory projects include design and implementation of parallel algorithms on a network or a parallel simulator.",
    "This course provides a thorough background in cryptography. It will cover the history of cryptography, the mathematics which underlies major cryptographic schemes, basic cryptographic primitives, advanced cryptographic primitives and applied cryptography.",
    "This course covers theoretical and practical study of the definition, application and implementation of programming languages. It includes linguistic concepts of syntax and semantics, translation of high-level languages into executable form. Data structuring, sequencing constructs, and modularization features of representative languages.",
    "This course features state-of-the-art techniques for software design, team management, and product development. Students will gain experience in actual software development, including requirements, specifications, coding, debugging, testing, and installation of a major software project. This is a project course.",
    "This course covers advanced topics of database management system design. Students will gain practical experience in planning, evaluating, and using database management system technology.",
    "This course provides an introduction to web programming using XML, Java Server Pages, Java Script and the family of technologies that evolve around web programming. The course balances conceptual topics with practical skills for designing and implementing conceptual models as XML schemas.",
    "This course provides a survey of security topics related to hardware security and digital media security. It covers aspects of how computer hardware is designed or modified to prevent hacking, both for desktop computers and also for digital video and video gaming systems. It also covers security and privacy issues in low-power computer settings such as smart cards and RFID.",
    "This course focuses on the fundamental concepts and technologies involved in the development of database driven web applications. Topics include integrating databases into the Web environment, internet applications with database interactions, transaction management, web database security, semi structured data management and XML.",
    "This course provides an introduction to several modeling tools (with an emphasis on designing computational models using commercial and grant sponsored modeling software and courseware) to investigate authentic scientific problems. This course includes an introduction to computational science, computational solutions to problems such as population dynamics, environmental relationships, and modeling of other scientific phenomena.",
    "This course covers advanced topics in computer graphics with a focus on three-dimensional (3D) graphics modeling techniques. Topics include: viewing, illumination, shading, basic rendering, geometric modeling, curves and surfaces, animations, advanced rendering and applications. Program projects, written and oral reports are required.",
    "This course covers model construction and simulation applied to problems taken from such diverse fields as economics, social science, communication networks, and computer systems. It includes programming in simulation languages such as SIMSCRIPT, SIMULA or GPSS.",
    "This course provides an introduction to computer science theory and the mathematical foundations of digital computers. Its topics include the family of computing machines (finite-state, push-down, and Turing), the Chomsky hierarchy of languages, decidability, unsolvable problems, and applications of automata to areas of syntactic analysis, modeling, and artificial intelligence.",
    "This course offers students an opportunity to pursue the investigation of current research areas and career options in computer science. Written and oral presentations are required.",
    "This capstone course provides depth in the application and integration of core computer science concepts. Emphasis is placed on integration of design and development techniques with concepts of operating systems, data structures, file processing, computer architecture, and software engineering. Business and scientific systems are developed. Written and oral presentations are required.",
    "This course covers advanced concepts of computer communication networks, including packet switching, local area networks, wide area networks, network protocols, and architectures. Students will engage in projects that may include communication architecture implementation, networking technology assessment, network performance evaluation, and network administration.",
    "This advanced course requires an independent project approved by the instructor.",
    "This course covers definition of heuristic versus algorithmic methods, rationale of the heuristic approach, description of cognitive processes, objectives of work in artificial intelligence, simulation of cognitive behavior, and heuristic programming techniques. It also includes a survey of examples from representative application areas including expert systems, the mind-brain problem, and the nature of intelligence. Individual projects to illustrate basic concepts are required.",
    "Offers students an opportunity to prepare for their chosen careers by combining academic theory and actual work experience. The work experience is to be full-time paid work for approximately 15 weeks. The Cooperative Education staff, the employer, the student and the student’s major department must agree on the employment terms and the learning experience to be gained. The academic grade (A, B, C, D, F) is the responsibility of the student’s major department, with due consideration given to the employer’s evaluation of the student. The student may enroll in this course in two non- consecutive semesters for a total of 12 credit hours. Six hours can count toward the student’s computer science requirements."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_science_page);
        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, mOverview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               int array[] = new int[52];
               for (int i = 0; i < array.length - 1; i++){
                   if (position == i){
                       Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                       Bundle bundle = new Bundle();
                       intent.putExtras(bundle);
                       final Intent title = intent.putExtra("title", mTitle[i]);
                       final Intent description = intent.putExtra("description", mDescription[i]);
                       final Intent overview = intent.putExtra("overview", mOverview[i]);
                       intent.putExtra("position", "" + i);
                       startActivity(intent);
                   }

               }
           }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        String rOverview[];
        MyAdapter(Context c, String title[], String description[], String overview[]) {
            super(c,R.layout.row, R.id.textview, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rOverview = overview;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent, false);
            TextView myTitle = row.findViewById(R.id.textview);
            TextView myDescription = row.findViewById(R.id.textview2);

            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            return  row;
        }
    }
}