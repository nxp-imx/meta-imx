SRC_URI_remove = "git://github.com/opencv/opencv.git;name=opencv"
SRC_URI_remove = "git://github.com/opencv/opencv_contrib.git;destsuffix=contrib;name=contrib"
SRC_URI_remove = "git://github.com/opencv/opencv_3rdparty.git;branch=ippicv/master_20191018;destsuffix=ipp;name=ipp"
SRC_URI_remove = "git://github.com/opencv/opencv_3rdparty.git;branch=contrib_xfeatures2d_boostdesc_20161012;destsuffix=boostdesc;name=boostdesc"
SRC_URI_remove = "git://github.com/opencv/opencv_3rdparty.git;branch=contrib_xfeatures2d_vgg_20160317;destsuffix=vgg;name=vgg"
SRC_URI_remove = "git://github.com/opencv/opencv_3rdparty.git;branch=contrib_face_alignment_20170818;destsuffix=face;name=face"
SRC_URI_remove = "git://github.com/WeChatCV/opencv_3rdparty.git;branch=wechat_qrcode;destsuffix=wechat_qrcode;name=wechat-qrcode"

# i.MX 6&7 uses the OpenSource git repository and i.MX 8 uses the NXP fork
ADDONURL = "git://github.com/opencv/opencv.git;name=opencv;protocol=https;nobranch=1"
ADDONURL_mx8 = ""

# Add protocol=https and nobranch=1
SRC_URI +="${ADDONURL} \
           git://github.com/opencv/opencv_contrib.git;destsuffix=contrib;name=contrib;protocol=https;nobranch=1 \
           git://github.com/opencv/opencv_3rdparty.git;branch=ippicv/master_20191018;destsuffix=ipp;name=ipp;protocol=https \
           git://github.com/opencv/opencv_3rdparty.git;branch=contrib_xfeatures2d_boostdesc_20161012;destsuffix=boostdesc;name=boostdesc;protocol=https \
           git://github.com/opencv/opencv_3rdparty.git;branch=contrib_xfeatures2d_vgg_20160317;destsuffix=vgg;name=vgg;protocol=https \
           git://github.com/opencv/opencv_3rdparty.git;branch=contrib_face_alignment_20170818;destsuffix=face;name=face;protocol=https \
           git://github.com/WeChatCV/opencv_3rdparty.git;branch=wechat_qrcode;destsuffix=wechat_qrcode;name=wechat-qrcode;protocol=https \
"
