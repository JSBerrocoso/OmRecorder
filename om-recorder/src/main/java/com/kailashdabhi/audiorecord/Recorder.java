/*
 * Copyright (C) 2016 Kailash Dabhi (Kingbull Technology)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kailashdabhi.audiorecord;

/**
 * A Recorder who can start and stop recording with startRecording() and stopRecording() method
 * respectively.
 *
 * @author Kailash Dabhi (kailash09dabhi@gmail.com)
 * @date 06-07-2016
 * @skype kailash.09
 */

public interface Recorder {

  void startRecording();

  void stopRecording();

  interface OnSilenceListener {
    void onSilence(long silenceTime);
  }
}