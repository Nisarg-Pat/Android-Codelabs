package com.projects.a06affirmations.data

import com.projects.a06affirmations.R
import com.projects.a06affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        val list = mutableListOf<Affirmation>()
        list.add(Affirmation(R.string.affirmation1, R.drawable.image1))
        list.add(Affirmation(R.string.affirmation2, R.drawable.image2))
        list.add(Affirmation(R.string.affirmation3, R.drawable.image3))
        list.add(Affirmation(R.string.affirmation4, R.drawable.image4))
        list.add(Affirmation(R.string.affirmation5, R.drawable.image5))
        list.add(Affirmation(R.string.affirmation6, R.drawable.image6))
        list.add(Affirmation(R.string.affirmation7, R.drawable.image7))
        list.add(Affirmation(R.string.affirmation8, R.drawable.image8))
        list.add(Affirmation(R.string.affirmation9, R.drawable.image9))
        list.add(Affirmation(R.string.affirmation10, R.drawable.image10))
        return list
//        return listOf<Affirmation>(
//            Affirmation(R.string.affirmation1),
//            Affirmation(R.string.affirmation2),
//            Affirmation(R.string.affirmation3),
//            Affirmation(R.string.affirmation4),
//            Affirmation(R.string.affirmation5),
//            Affirmation(R.string.affirmation6),
//            Affirmation(R.string.affirmation7),
//            Affirmation(R.string.affirmation8),
//            Affirmation(R.string.affirmation9),
//            Affirmation(R.string.affirmation10)
//        )
    }
}