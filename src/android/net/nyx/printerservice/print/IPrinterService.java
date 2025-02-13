/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\samei\AppData\Local\Android\android-sdk\build-tools\35.0.0\aidl.exe -IC:\DevWorkspace\Android_Libraries_Ref C:\DevWorkspace\GitRepositories\Custom_Printer_Plugin\src\android\net\nyx\printerservice\print\IPrinterService.aidl
 */
package net.nyx.printerservice.print;
public interface IPrinterService extends android.os.IInterface
{
  /** Default implementation for IPrinterService. */
  public static class Default implements net.nyx.printerservice.print.IPrinterService
  {
    @Override public java.lang.String getServiceVersion() throws android.os.RemoteException
    {
      return null;
    }
    @Override public int getPrinterVersion(java.lang.String[] ver) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getPrinterModel(java.lang.String[] model) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getPrinterStatus() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int paperOut(int px) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int paperBack(int px) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int printText(java.lang.String text, net.nyx.printerservice.print.PrintTextFormat textFormat) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Print text
     * 
     * @param text       text content
     * @param textFormat text format
     * @param textWidth  maximum text width
     * @param align      The alignment of the maximum text width relative to the printing paper
     *                   The default is 0. 0--Align left, 1--Align center, 2--Align right
     * @return Print result
     */
    @Override public int printText2(java.lang.String text, net.nyx.printerservice.print.PrintTextFormat textFormat, int textWidth, int align) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Print barcode
     * 
     * @param content      barcode content
     * @param width        barcode width, px
     * @param height       barcode height, px
     * @param textPosition barcode content text position, the default is 0.
     *                     0--don't print barcode content
     *                     1--content above the barcode
     *                     2--content below the barcode
     *                     3--text print both the top and bottom of the barcode
     * @param align        alignment, the default is 0. 0--Align left, 1--Align center, 2--Align right
     * @return Print result
     */
    @Override public int printBarcode(java.lang.String content, int width, int height, int textPosition, int align) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Print QR code
     * 
     * @param content QRCode content
     * @param width   QRCode width, px
     * @param height  QRCode height, px
     * @param align   alignment, the default is 0. 0--Align left, 1--Align center, 2--Align right
     * @return Print result
     */
    @Override public int printQrCode(java.lang.String content, int width, int height, int align) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Locate the next label
     * 
     * @param labelHeight label paper height, px
     * @param labelGap    label paper gap, px
     * @return Result
     */
    @Override public int labelLocate(int labelHeight, int labelGap) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Label printing ends, paper automatically moves to the tear-off position.
     * This method must appear in pairs with {@link #labelLocate}
     * 
     * @return Result
     */
    @Override public int labelPrintEnd() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Auto locate label. This method only can be called on the system that has performed
     * label learning by {@link #labelDetectAuto}
     * 
     * @return Result
     */
    @Override public int labelLocateAuto() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Label learning by automatic label detection. This method will start label learning
     * 
     * @return Result
     */
    @Override public int labelDetectAuto() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Label learning has been performed
     * 
     * @return Result
     */
    @Override public boolean hasLabelLearning() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Clear label learning data
     * 
     * @return Result
     */
    @Override public int clearLabelLearning() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Print ESC/POS commands
     * 
     * @param cmd ESC/POS commands
     * @return Result
     */
    @Override public int printEscposData(byte[] cmd) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Print a row of a table
     * 
     * @param texts   table row contents
     * @param weights column width weight
     * @param formats text format for each column
     * @return Result
     */
    @Override public int printTableText(java.lang.String[] texts, int[] weights, net.nyx.printerservice.print.PrintTextFormat[] formats) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * After printing, feed paper to cutting position
     * 
     * @return Result
     */
    @Override public int printEndAutoOut() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Control the status of the customer display LCD
     * 
     * @param flag 0--init 1--wakeup LCD 2--sleep LCD 3--clear LCD 4--reset LCD display
     * @return Result
     * @since PrinterService v1.6.3
     */
    @Override public int configLcd(int flag) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Open cash drawer
     * 
     * @return Result
     * @since PrinterService v1.6.1
     */
    @Override public int openCashBox() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Trigger infrared scan
     * 
     * @return Result
     * @since PrinterService v1.7.0
     */
    @Override public int triggerQscScan() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements net.nyx.printerservice.print.IPrinterService
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an net.nyx.printerservice.print.IPrinterService interface,
     * generating a proxy if needed.
     */
    public static net.nyx.printerservice.print.IPrinterService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof net.nyx.printerservice.print.IPrinterService))) {
        return ((net.nyx.printerservice.print.IPrinterService)iin);
      }
      return new net.nyx.printerservice.print.IPrinterService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_getServiceVersion:
        {
          java.lang.String _result = this.getServiceVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getPrinterVersion:
        {
          java.lang.String[] _arg0;
          int _arg0_length = data.readInt();
          if (_arg0_length < 0) {
            _arg0 = null;
          } else {
            _arg0 = new java.lang.String[_arg0_length];
          }
          int _result = this.getPrinterVersion(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeStringArray(_arg0);
          break;
        }
        case TRANSACTION_getPrinterModel:
        {
          java.lang.String[] _arg0;
          int _arg0_length = data.readInt();
          if (_arg0_length < 0) {
            _arg0 = null;
          } else {
            _arg0 = new java.lang.String[_arg0_length];
          }
          int _result = this.getPrinterModel(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeStringArray(_arg0);
          break;
        }
        case TRANSACTION_getPrinterStatus:
        {
          int _result = this.getPrinterStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_paperOut:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.paperOut(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_paperBack:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.paperBack(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_printText:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          net.nyx.printerservice.print.PrintTextFormat _arg1;
          _arg1 = _Parcel.readTypedObject(data, net.nyx.printerservice.print.PrintTextFormat.CREATOR);
          int _result = this.printText(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_printText2:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          net.nyx.printerservice.print.PrintTextFormat _arg1;
          _arg1 = _Parcel.readTypedObject(data, net.nyx.printerservice.print.PrintTextFormat.CREATOR);
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _result = this.printText2(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_printBarcode:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _result = this.printBarcode(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_printQrCode:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _result = this.printQrCode(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_labelLocate:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.labelLocate(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_labelPrintEnd:
        {
          int _result = this.labelPrintEnd();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_labelLocateAuto:
        {
          int _result = this.labelLocateAuto();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_labelDetectAuto:
        {
          int _result = this.labelDetectAuto();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_hasLabelLearning:
        {
          boolean _result = this.hasLabelLearning();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_clearLabelLearning:
        {
          int _result = this.clearLabelLearning();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_printEscposData:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.printEscposData(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_printTableText:
        {
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          int[] _arg1;
          _arg1 = data.createIntArray();
          net.nyx.printerservice.print.PrintTextFormat[] _arg2;
          _arg2 = data.createTypedArray(net.nyx.printerservice.print.PrintTextFormat.CREATOR);
          int _result = this.printTableText(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_printEndAutoOut:
        {
          int _result = this.printEndAutoOut();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_configLcd:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.configLcd(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_openCashBox:
        {
          int _result = this.openCashBox();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_triggerQscScan:
        {
          int _result = this.triggerQscScan();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements net.nyx.printerservice.print.IPrinterService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public java.lang.String getServiceVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getPrinterVersion(java.lang.String[] ver) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(ver.length);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterVersion, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          _reply.readStringArray(ver);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getPrinterModel(java.lang.String[] model) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(model.length);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterModel, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          _reply.readStringArray(model);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getPrinterStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterStatus, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int paperOut(int px) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(px);
          boolean _status = mRemote.transact(Stub.TRANSACTION_paperOut, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int paperBack(int px) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(px);
          boolean _status = mRemote.transact(Stub.TRANSACTION_paperBack, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int printText(java.lang.String text, net.nyx.printerservice.print.PrintTextFormat textFormat) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(text);
          _Parcel.writeTypedObject(_data, textFormat, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printText, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Print text
       * 
       * @param text       text content
       * @param textFormat text format
       * @param textWidth  maximum text width
       * @param align      The alignment of the maximum text width relative to the printing paper
       *                   The default is 0. 0--Align left, 1--Align center, 2--Align right
       * @return Print result
       */
      @Override public int printText2(java.lang.String text, net.nyx.printerservice.print.PrintTextFormat textFormat, int textWidth, int align) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(text);
          _Parcel.writeTypedObject(_data, textFormat, 0);
          _data.writeInt(textWidth);
          _data.writeInt(align);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printText2, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Print barcode
       * 
       * @param content      barcode content
       * @param width        barcode width, px
       * @param height       barcode height, px
       * @param textPosition barcode content text position, the default is 0.
       *                     0--don't print barcode content
       *                     1--content above the barcode
       *                     2--content below the barcode
       *                     3--text print both the top and bottom of the barcode
       * @param align        alignment, the default is 0. 0--Align left, 1--Align center, 2--Align right
       * @return Print result
       */
      @Override public int printBarcode(java.lang.String content, int width, int height, int textPosition, int align) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(content);
          _data.writeInt(width);
          _data.writeInt(height);
          _data.writeInt(textPosition);
          _data.writeInt(align);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBarcode, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Print QR code
       * 
       * @param content QRCode content
       * @param width   QRCode width, px
       * @param height  QRCode height, px
       * @param align   alignment, the default is 0. 0--Align left, 1--Align center, 2--Align right
       * @return Print result
       */
      @Override public int printQrCode(java.lang.String content, int width, int height, int align) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(content);
          _data.writeInt(width);
          _data.writeInt(height);
          _data.writeInt(align);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printQrCode, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Locate the next label
       * 
       * @param labelHeight label paper height, px
       * @param labelGap    label paper gap, px
       * @return Result
       */
      @Override public int labelLocate(int labelHeight, int labelGap) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(labelHeight);
          _data.writeInt(labelGap);
          boolean _status = mRemote.transact(Stub.TRANSACTION_labelLocate, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Label printing ends, paper automatically moves to the tear-off position.
       * This method must appear in pairs with {@link #labelLocate}
       * 
       * @return Result
       */
      @Override public int labelPrintEnd() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_labelPrintEnd, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Auto locate label. This method only can be called on the system that has performed
       * label learning by {@link #labelDetectAuto}
       * 
       * @return Result
       */
      @Override public int labelLocateAuto() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_labelLocateAuto, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Label learning by automatic label detection. This method will start label learning
       * 
       * @return Result
       */
      @Override public int labelDetectAuto() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_labelDetectAuto, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Label learning has been performed
       * 
       * @return Result
       */
      @Override public boolean hasLabelLearning() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hasLabelLearning, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Clear label learning data
       * 
       * @return Result
       */
      @Override public int clearLabelLearning() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearLabelLearning, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Print ESC/POS commands
       * 
       * @param cmd ESC/POS commands
       * @return Result
       */
      @Override public int printEscposData(byte[] cmd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(cmd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printEscposData, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Print a row of a table
       * 
       * @param texts   table row contents
       * @param weights column width weight
       * @param formats text format for each column
       * @return Result
       */
      @Override public int printTableText(java.lang.String[] texts, int[] weights, net.nyx.printerservice.print.PrintTextFormat[] formats) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(texts);
          _data.writeIntArray(weights);
          _data.writeTypedArray(formats, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printTableText, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * After printing, feed paper to cutting position
       * 
       * @return Result
       */
      @Override public int printEndAutoOut() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printEndAutoOut, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Control the status of the customer display LCD
       * 
       * @param flag 0--init 1--wakeup LCD 2--sleep LCD 3--clear LCD 4--reset LCD display
       * @return Result
       * @since PrinterService v1.6.3
       */
      @Override public int configLcd(int flag) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(flag);
          boolean _status = mRemote.transact(Stub.TRANSACTION_configLcd, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Open cash drawer
       * 
       * @return Result
       * @since PrinterService v1.6.1
       */
      @Override public int openCashBox() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openCashBox, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Trigger infrared scan
       * 
       * @return Result
       * @since PrinterService v1.7.0
       */
      @Override public int triggerQscScan() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_triggerQscScan, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getPrinterVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getPrinterModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getPrinterStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_paperOut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_paperBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_printText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_printText2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_printBarcode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_printQrCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_labelLocate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_labelPrintEnd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_labelLocateAuto = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_labelDetectAuto = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_hasLabelLearning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_clearLabelLearning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_printEscposData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_printTableText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_printEndAutoOut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_configLcd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_openCashBox = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_triggerQscScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "net.nyx.printerservice.print.IPrinterService";
  public java.lang.String getServiceVersion() throws android.os.RemoteException;
  public int getPrinterVersion(java.lang.String[] ver) throws android.os.RemoteException;
  public int getPrinterModel(java.lang.String[] model) throws android.os.RemoteException;
  public int getPrinterStatus() throws android.os.RemoteException;
  public int paperOut(int px) throws android.os.RemoteException;
  public int paperBack(int px) throws android.os.RemoteException;
  public int printText(java.lang.String text, net.nyx.printerservice.print.PrintTextFormat textFormat) throws android.os.RemoteException;
  /**
   * Print text
   * 
   * @param text       text content
   * @param textFormat text format
   * @param textWidth  maximum text width
   * @param align      The alignment of the maximum text width relative to the printing paper
   *                   The default is 0. 0--Align left, 1--Align center, 2--Align right
   * @return Print result
   */
  public int printText2(java.lang.String text, net.nyx.printerservice.print.PrintTextFormat textFormat, int textWidth, int align) throws android.os.RemoteException;
  /**
   * Print barcode
   * 
   * @param content      barcode content
   * @param width        barcode width, px
   * @param height       barcode height, px
   * @param textPosition barcode content text position, the default is 0.
   *                     0--don't print barcode content
   *                     1--content above the barcode
   *                     2--content below the barcode
   *                     3--text print both the top and bottom of the barcode
   * @param align        alignment, the default is 0. 0--Align left, 1--Align center, 2--Align right
   * @return Print result
   */
  public int printBarcode(java.lang.String content, int width, int height, int textPosition, int align) throws android.os.RemoteException;
  /**
   * Print QR code
   * 
   * @param content QRCode content
   * @param width   QRCode width, px
   * @param height  QRCode height, px
   * @param align   alignment, the default is 0. 0--Align left, 1--Align center, 2--Align right
   * @return Print result
   */
  public int printQrCode(java.lang.String content, int width, int height, int align) throws android.os.RemoteException;
  /**
   * Locate the next label
   * 
   * @param labelHeight label paper height, px
   * @param labelGap    label paper gap, px
   * @return Result
   */
  public int labelLocate(int labelHeight, int labelGap) throws android.os.RemoteException;
  /**
   * Label printing ends, paper automatically moves to the tear-off position.
   * This method must appear in pairs with {@link #labelLocate}
   * 
   * @return Result
   */
  public int labelPrintEnd() throws android.os.RemoteException;
  /**
   * Auto locate label. This method only can be called on the system that has performed
   * label learning by {@link #labelDetectAuto}
   * 
   * @return Result
   */
  public int labelLocateAuto() throws android.os.RemoteException;
  /**
   * Label learning by automatic label detection. This method will start label learning
   * 
   * @return Result
   */
  public int labelDetectAuto() throws android.os.RemoteException;
  /**
   * Label learning has been performed
   * 
   * @return Result
   */
  public boolean hasLabelLearning() throws android.os.RemoteException;
  /**
   * Clear label learning data
   * 
   * @return Result
   */
  public int clearLabelLearning() throws android.os.RemoteException;
  /**
   * Print ESC/POS commands
   * 
   * @param cmd ESC/POS commands
   * @return Result
   */
  public int printEscposData(byte[] cmd) throws android.os.RemoteException;
  /**
   * Print a row of a table
   * 
   * @param texts   table row contents
   * @param weights column width weight
   * @param formats text format for each column
   * @return Result
   */
  public int printTableText(java.lang.String[] texts, int[] weights, net.nyx.printerservice.print.PrintTextFormat[] formats) throws android.os.RemoteException;
  /**
   * After printing, feed paper to cutting position
   * 
   * @return Result
   */
  public int printEndAutoOut() throws android.os.RemoteException;
  /**
   * Control the status of the customer display LCD
   * 
   * @param flag 0--init 1--wakeup LCD 2--sleep LCD 3--clear LCD 4--reset LCD display
   * @return Result
   * @since PrinterService v1.6.3
   */
  public int configLcd(int flag) throws android.os.RemoteException;
  /**
   * Open cash drawer
   * 
   * @return Result
   * @since PrinterService v1.6.1
   */
  public int openCashBox() throws android.os.RemoteException;
  /**
   * Trigger infrared scan
   * 
   * @return Result
   * @since PrinterService v1.7.0
   */
  public int triggerQscScan() throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
