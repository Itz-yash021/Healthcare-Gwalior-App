package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView t1 = (TextView) findViewById(R.id.textView5);
        TextView t2= (TextView) findViewById(R.id.textView6);
        ImageView imageView = (ImageView) findViewById(R.id.image5);

        //Getting the Intent
        Intent i = getIntent();

        //Getting the Values from First Activity using the Intent received
        String name = i.getStringExtra("disease_name");

        //Setting the Values to Intent
        t1.setText(name);

        if (name.equals("Cold and Flu")) {
            imageView.setImageResource(R.drawable.cold_and_flu);
            t2.setText("Causes:\n Both of these illnesses are upper respiratory infections, meaning they involve your nose, throat, and lungs. Viruses cause both colds and flu by increasing inflammation of the membranes in the nose and throat.\n\n Symptoms:\n 1. fever (100° F),\n 2. headache,\n 3. more intense pain and fatigue, and\n 4. more severe, often dry cough.\n\n Some Remedies:\n 1. Rest more than usual and avoid exercise until symptoms are gone.\n 2. Drink lots of clear fluids (e.g., water, tea).\n 3. Stay away from cigarette smoke.\n 4. Avoid drinking alcohol because it weakens your immune system and may interact with medications.\n 5. Avoid caffeine, which can increase congestion and dehydration.\n 6. Eat a well-balanced diet, including fruits, vegetables, and grains.");
        } else if (name.equals("Stomach Aches")) {
            imageView.setImageResource(R.drawable.stomach_aches);
            t2.setText("Causes:\n Even though it’s natural to have gas in your digestive tract, excessive gas can cause intense, temporary pain. People who suffer discomfort from gas in the intestine report abdominal bloating, flatulence, and jabbing pains or cramps in the abdomen.\n\n Symptoms:\n 1. abdominal bloating, flatulence, and jabbing pains or cramps in the abdomen.\n\n Some Remedies:\n 1. Avoid foods that trigger gas.\n 2. Avoid swallowing excess air by not chewing gum or eating hard candy.\n 3. Take digestive enzyme supplements, such as Beano (for high-fiber foods) and lactase supplements (for milk products).\n 4. Eat only small amounts of dairy products with food, if you suspect lactose intolerance.\n 5. Eat several small meals throughout the day instead of two or three larger ones.\n 6. Eat slowly, in a relaxed setting, and chew your food thoroughly.\n 7. Take a stroll after meals. Don’t sit in a slumped position or lie down after eating.\n 8. If increasing the fiber in your diet, do so gradually\n");
        } else if (name.equals("Conjunctivitis")) {
            imageView.setImageResource(R.drawable.conjunctivitis);
            t2.setText("Causes:\n Conjunctivitis, an inflammation of the transparent membrane (conjunctiva) that lines your eyelids and part of your eyeballs, has several possible causes. It could be a bacterial or viral infection, an allergic reaction to pollen or animal dander, or a result of chemical irritants (smoke, chlorine, lens solution, etc.).\n\n Symptoms:\n These symptoms may last a few hours to several weeks: redness, itching, tearing, burning sensation, pus-like discharge and/or crusting of the eyelids. Because conjunctivitis causes inflammation of the small blood vessels in the conjunctiva to become more prominent, the whites of your eyes will appear pink or red. When you wake you are likely to feel that your eyelids are pasted shut, and your vision may not be as clear as usual.\n\n Some Remedies:\n 1. Wash your hands frequently to prevent spreading an existing infection to your other eye, and to other people.\n 2. Don’t rub your eyes.\n 3. Use a cool wet washcloth to soak off any crusting.\n 4. Use a warm or cool compress to reduce discomfort.\n");
        } else if (name.equals("Diarrhea")) {
            imageView.setImageResource(R.drawable.diarrhea);
            t2.setText("Causes:\n Diarrhea — loose, watery and possibly more frequent bowel movements. A number of diseases and conditions can cause diarrhea, including: Viruses, Bacteria and parasites, Medications, Lactose intolerance, Fructose, Artificial sweeteners, Surgery, mOther digestive disorders\n\n Symptoms\n 1. watery, loose stools\n 2. frequent bowel movements\n 3. cramping or pain in the abdomen, nausea, bloating\n 4. possibly fever or bloody stools, depending on the cause\n\n Some Remedies:\n 1. Avoid foods that are milk-based, greasy, high-fiber, or very sweet because these are likely to aggravate diarrhea.\n 2. Avoid caffeine and alcohol.\n 3. Do not eat solid food if you have signs of dehydration (thirst, light-headed, dark urine). Instead, drink about 2 cups of clear fluids per hour (if vomiting isn’t present), such as sports drinks and broth. Water alone is not enough because your body needs sodium and sugar to replace what it’s losing.\n 4. Avoid high sugar drinks.\n");
        }

    }
}