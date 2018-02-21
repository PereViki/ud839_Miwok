package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Image of the word
     */
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    /**
     * Pronunciation of the word
     */
    private int mPronunciationResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation      is the word in a language that the user is already familiar with
     *                                (such as English)
     * @param miwokTranslation        is the word in the Miwok language
     * @param imageResourceID         is the image resource ID of the drawable of the word
     * @param pronunciationResourceID
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int pronunciationResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mPronunciationResourceID = pronunciationResourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation      is the word in a language that the user is already familiar with
     *                                (such as English)
     * @param miwokTranslation        is the word in the Miwok language
     * @param pronunciationResourceID
     */
    public Word(String defaultTranslation, String miwokTranslation, int pronunciationResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mPronunciationResourceID = pronunciationResourceID;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image resource ID of the drawable of the word.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the pronunciation resource ID of the pronunciation of the word.
     */
    public int getPronunciationID() {
        return mPronunciationResourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mPronunciationResourceID=" + mPronunciationResourceID +
                '}';
    }
}
