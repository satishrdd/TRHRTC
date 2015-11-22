package me.kevingleason.androidrtc;

/**
 * Created by satish on 11/15/2015.
 */
public class ByteArray {

        private byte[] mByteArray = new byte[1];
        private int mUsedLength;
        private boolean mShowInAscii;

        void add(byte[] newArray) {
            // Make sure we have enough space to store byte array.
            while (mUsedLength + newArray.length > mByteArray.length) {
                byte[] tmpArray = new byte[mByteArray.length * 2];
                System.arraycopy(mByteArray, 0, tmpArray, 0, mUsedLength);
                mByteArray = tmpArray;
            }

            // Add byte array.
            System.arraycopy(newArray, 0, mByteArray, mUsedLength, newArray.length);
            mUsedLength += newArray.length;
        }

        void toggleCoding() {
            mShowInAscii = !mShowInAscii;
        }

        @Override
        public String toString() {
            StringBuilder hexStr = new StringBuilder();

            if (mShowInAscii) {
                for (int i = 0; i < mUsedLength; i++) {
                    if (Character.isLetterOrDigit(mByteArray[i])) {
                        hexStr.append(new String(new byte[] {mByteArray[i]}));
                    } else {
                        hexStr.append('.');
                    }
                }
            } else {
                for (int i = 0; i < mUsedLength; i++) {
                    hexStr.append(String.format("%1$02X", mByteArray[i]));
                    hexStr.append(" ");
                }
            }

            return hexStr.toString();
        }

}
