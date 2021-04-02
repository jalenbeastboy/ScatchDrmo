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

public class InformationTechPage extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Computer Science Colloquium", "Introduction To Programming","Computer Programming I",
            "Computer Programming II", "Introduction To Computer Technology", "Professional Development Seminar", "Introduction to Computer Software Systems",
            "Introduction to Computer Hardware Organization" ,"Operating Systems", "Computer Architecture", " System Administration I", "Introduction to Information Security",
            "Fundamentals of Information Systems", "Data Communications", "Principles of Database Management", "Systems Administration II", " Software Engineering", "Database Management System Design",
           "Web Programming", "Systems Design and Development", "Co-Op"};
    String mDescription[] = {"CIT 1105", "CIT 1308", "CIT 1310", "CIT 1311", "CIT  1307", "CIT 2131", "CIT 2310", "CIT 2320", "CIT 3321", "CIT 3322",
            "CIT 3332", "CIT 3325", "CIT 3332", "CIT 3351", "CIT 3355", "CIT 4323", "CIT 4350", "CIT 4355", "CIT 4356", "CIT 4388", "CIT 4391" };
    String mOverview[] ={"This course concentrates on strategies for success in computer science. The course concentrates on broadening students’ general knowledge of computer science as well as developing critical thinking and problem solving skills using current technologies and computing tools.",
"This course provides an introduction to event-driven programming using Visual Basic or a similar programming language. Topics include the programming environment, objects, events, code, properties, statements, subprograms, data types, input-output, and user interface design.",
    "This course is an introduction to problem-solving methods and algorithm development. It includes program design, coding, debugging and documentation using a high-level language.",
    "This course offers continued development in program design. Larger program",
    "Topics include the history and overview of computer hardware and software. It provides more advanced exposure to commonly used software, including database programming, spreadsheet functions, computer graphics applications design, desk-top publishing, ethics, security, and other applications",
    "This course develops professional skills in computer science and information technology students.  Habitual and thoughtful use of ccommunication skills, liberal and technical knowledge skills, technical skills, and critical reasoning will be cultivated by the integration of accumulated knowledge and skills, interaction with professionals in the discipline, oral and written communication activities, and by promoting the development of practical professional experience via a team project, peer collaboration, self-directed learning, planning and management.  The course engages students in activities designed to prepare them to obtain internships, research experiences, co-op experiences and ultimately career positions.  The course may be repeated up to eight semesters, and students may earn up to six semester hours of academic credit.",
    "This course provides an introduction to computer architecture, systems programs, machine organization, instructions, data representation, and addressing. Topics covered include assemblers, linkers, loaders, operating systems, and elementary assembler language programming.",
    "This course covers the organization and functional design of computer components such as the memory unit, arithmetic and logic unit and I/O devices. Other topics include data channels, interrupts, micro-programming, and design of simple combinatorial circuits.",
    "This course is a study of the operating system. Topics include concepts of system structure, memory management, process management, and recovery procedures.",
    "This course focuses on design alternative in computer architecture. It covers instruction set architectures, memory subsystem organization, interfacing concepts, and interprocessor communication. Architectures to be studied will include data flow machines, vector and array processors, and pipeline architectures. Concepts related to parallel and distribution algorithms will also be studied.",
    "This course prepares students to administer a computer system. Intensive laboratory experiences develop skills in operating system administration, software configuration, fundamentals of security, and procedures in a networked environment.",
    "This course provides an essential introduction to the basics of information and computer security. Topics include information security goals and principles, access control, malicious software, basic applied cryptography, basic network security, and privacy issues in computing systems.",
    "This course addresses the structure and functionality of the Internet and software that exploits it. Topics include mark up languages, Web tools, static dynamic and active Web pages, multimedia in Web applications, communication protocols, clientserver computing, scripting, group communication support, e-commerce, and security. Topics also include systems for organizing and coordinating work at different sites that exploit the Internet, and architectures to exploit the distributed",
    "This course is an introduction to data communications. Topics include asynchronous and synchronous communication models, telephone switching systems, error detection, protocols, packet switching, information transmission systems, modulation systems, and computer network technology.",
    "This course covers concepts of logical and physical data structures, data security, and accuracy. It includes an overview of basic approaches to database organization and implementation and hands-on interaction with at least one hierarchical, network, or relational model database.",
    "A continuation of CIT 3323 – System Administration I, this course provides more comprehensive exposure to PC operating system administration, client-server administration, network administration, UNIX/Linux administration, and system security.",
    "This course features state-of-the-art techniques for software design, team management, and product development. Students will gain experience in actual software development, including requirements, specifications, coding, debugging, testing, and installation of a major software project. This is a project course.",
    "This course covers advanced topics of database management system design. Students will gain practical experience in planning, evaluating, and using database management system technology.",
    "This course provides an introduction to web programming using XML, Java Server Pages, Java Script and the family of technologies that evolve around web programming. The course balances conceptual topics with practical skills for designing and implementing conceptual models as XML schemas.",
    "This capstone course provides depth in the application and integration of core computer science concepts. Emphasis is placed on integration of design and development techniques with concepts of operating systems, data structures, file processing, computer architecture and software engineering. Business and scientific systems are developed.",
    "This course is designed for students for whom a half-time work experience is more appropriate. In such cases, students will usually be enrolled in courses other than Cooperative Education at the university part-time while involved in a work/learning experience for 20 hours per week. Procedures for approvals of placement and credits toward graduation are the same as for 3691 and 4691."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_tech_page);
        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, mOverview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Set the array of the class and position it
                int array[] = new int[20];
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

