package def.dom;

import jsweet.util.StringTypes;
import jsweet.util.StringTypes.*;

public class HTMLMarqueeElement extends HTMLElement {
    public java.lang.String behavior;
    public java.lang.Object bgColor;
    public java.lang.String direction;
    public java.lang.String height;
    public double hspace;
    public double loop;
    public java.util.function.Function<Event,java.lang.Object> onbounce;
    public java.util.function.Function<Event,java.lang.Object> onfinish;
    public java.util.function.Function<Event,java.lang.Object> onstart;
    public double scrollAmount;
    public double scrollDelay;
    public java.lang.Boolean trueSpeed;
    public double vspace;
    public java.lang.String width;
    native public void start();
    native public void stop();
    native public void addEventListener(jsweet.util.StringTypes.MSContentZoom type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureChange type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureDoubleTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureEnd type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureHold type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGotPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSInertiaStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSLostPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSManipulationStateChanged type, java.util.function.Function<MSManipulationEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerCancel type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerDown type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerEnter type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerLeave type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerMove type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOut type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOver type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerUp type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.abort type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.activate type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.ariarequest type, java.util.function.Function<AriaRequestEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.beforeactivate type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.beforecopy type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.beforecut type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.beforedeactivate type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.beforepaste type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.blur type, java.util.function.Function<FocusEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.bounce type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.canplay type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.canplaythrough type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.change type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.click type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.command type, java.util.function.Function<CommandEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.contextmenu type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.copy type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.cuechange type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.cut type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.dblclick type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.deactivate type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.drag type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.dragend type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.dragenter type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.dragleave type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.dragover type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.dragstart type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.drop type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.durationchange type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.emptied type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.ended type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.error type, java.util.function.Function<ErrorEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.finish type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.focus type, java.util.function.Function<FocusEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.gotpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.input type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.keydown type, java.util.function.Function<KeyboardEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.keypress type, java.util.function.Function<KeyboardEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.keyup type, java.util.function.Function<KeyboardEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.load type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.loadeddata type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.loadedmetadata type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.loadstart type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.lostpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mousedown type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mouseenter type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mouseleave type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mousemove type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mouseout type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mouseover type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mouseup type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mousewheel type, java.util.function.Function<MouseWheelEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.paste type, java.util.function.Function<DragEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pause type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.play type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.playing type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointercancel type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerdown type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerenter type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerleave type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointermove type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerout type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerover type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerup type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.progress type, java.util.function.Function<ProgressEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.ratechange type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.reset type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.scroll type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.seeked type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.seeking type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.select type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.selectstart type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.stalled type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.start type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.submit type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.suspend type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.timeupdate type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchcancel type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchend type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchmove type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchstart type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.volumechange type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.waiting type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenchange type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenerror type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.wheel type, java.util.function.Function<WheelEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListener listener, java.lang.Boolean useCapture);
    public static HTMLMarqueeElement prototype;
    public HTMLMarqueeElement(){}
    native public void addEventListener(jsweet.util.StringTypes.MSContentZoom type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureChange type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureDoubleTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureEnd type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureHold type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGotPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSInertiaStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSLostPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSManipulationStateChanged type, java.util.function.Function<MSManipulationEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerCancel type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerDown type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerEnter type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerLeave type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerMove type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOut type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOver type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerUp type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.abort type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.activate type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.ariarequest type, java.util.function.Function<AriaRequestEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.beforeactivate type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.beforecopy type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.beforecut type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.beforedeactivate type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.beforepaste type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.blur type, java.util.function.Function<FocusEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.bounce type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.canplay type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.canplaythrough type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.change type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.click type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.command type, java.util.function.Function<CommandEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.contextmenu type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.copy type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.cuechange type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.cut type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.dblclick type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.deactivate type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.drag type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.dragend type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.dragenter type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.dragleave type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.dragover type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.dragstart type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.drop type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.durationchange type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.emptied type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.ended type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.error type, java.util.function.Function<ErrorEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.finish type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.focus type, java.util.function.Function<FocusEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.gotpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.input type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.keydown type, java.util.function.Function<KeyboardEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.keypress type, java.util.function.Function<KeyboardEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.keyup type, java.util.function.Function<KeyboardEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.load type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.loadeddata type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.loadedmetadata type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.loadstart type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.lostpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mousedown type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mouseenter type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mouseleave type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mousemove type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mouseout type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mouseover type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mouseup type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mousewheel type, java.util.function.Function<MouseWheelEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.paste type, java.util.function.Function<DragEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pause type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.play type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.playing type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointercancel type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerdown type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerenter type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerleave type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointermove type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerout type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerover type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerup type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.progress type, java.util.function.Function<ProgressEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.ratechange type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.reset type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.scroll type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.seeked type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.seeking type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.select type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.selectstart type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.stalled type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.start type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.submit type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.suspend type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.timeupdate type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchcancel type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchend type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchmove type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchstart type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.volumechange type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.waiting type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenchange type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenerror type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.wheel type, java.util.function.Function<WheelEvent,java.lang.Object> listener);
    native public void addEventListener(java.lang.String type, EventListener listener);
    native public void addEventListener(java.lang.String type, EventListenerObject listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListenerObject listener);
}

