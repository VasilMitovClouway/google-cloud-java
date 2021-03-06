// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

public interface FaceAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta1.FaceAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Thumbnail of a representative face view (in JPEG format). Encoding: base64.
   * </pre>
   *
   * <code>string thumbnail = 1;</code>
   */
  java.lang.String getThumbnail();
  /**
   * <pre>
   * Thumbnail of a representative face view (in JPEG format). Encoding: base64.
   * </pre>
   *
   * <code>string thumbnail = 1;</code>
   */
  com.google.protobuf.ByteString
      getThumbnailBytes();

  /**
   * <pre>
   * All locations where a face was detected.
   * Faces are detected and tracked on a per-video basis
   * (as opposed to across multiple videos).
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoSegment segments = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta1.VideoSegment> 
      getSegmentsList();
  /**
   * <pre>
   * All locations where a face was detected.
   * Faces are detected and tracked on a per-video basis
   * (as opposed to across multiple videos).
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoSegment segments = 2;</code>
   */
  com.google.cloud.videointelligence.v1beta1.VideoSegment getSegments(int index);
  /**
   * <pre>
   * All locations where a face was detected.
   * Faces are detected and tracked on a per-video basis
   * (as opposed to across multiple videos).
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoSegment segments = 2;</code>
   */
  int getSegmentsCount();
  /**
   * <pre>
   * All locations where a face was detected.
   * Faces are detected and tracked on a per-video basis
   * (as opposed to across multiple videos).
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoSegment segments = 2;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder> 
      getSegmentsOrBuilderList();
  /**
   * <pre>
   * All locations where a face was detected.
   * Faces are detected and tracked on a per-video basis
   * (as opposed to across multiple videos).
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoSegment segments = 2;</code>
   */
  com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder getSegmentsOrBuilder(
      int index);

  /**
   * <pre>
   * Face locations at one frame per second.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.FaceLocation locations = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta1.FaceLocation> 
      getLocationsList();
  /**
   * <pre>
   * Face locations at one frame per second.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.FaceLocation locations = 3;</code>
   */
  com.google.cloud.videointelligence.v1beta1.FaceLocation getLocations(int index);
  /**
   * <pre>
   * Face locations at one frame per second.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.FaceLocation locations = 3;</code>
   */
  int getLocationsCount();
  /**
   * <pre>
   * Face locations at one frame per second.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.FaceLocation locations = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta1.FaceLocationOrBuilder> 
      getLocationsOrBuilderList();
  /**
   * <pre>
   * Face locations at one frame per second.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.FaceLocation locations = 3;</code>
   */
  com.google.cloud.videointelligence.v1beta1.FaceLocationOrBuilder getLocationsOrBuilder(
      int index);
}
