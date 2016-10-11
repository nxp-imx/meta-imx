DISTRO = "fsl-imx"
DISTRO_NAME = "Freescale i.MX Release Distro"
DISTRO_VERSION = "4.1.15-1.2.0"
DISTRO_CODENAME = "jethro"
SDK_VENDOR = "-pokysdk"
SDK_VERSION := "${DISTRO_VERSION}"
#SDK_VERSION := "${@'${DISTRO_VERSION}'.replace('snapshot-${DATE}','snapshot')}"

MAINTAINER = "Freescale Semiconductors <lauren.post@nxp.com>"

TARGET_VENDOR = "-poky"

LOCALCONF_VERSION = "1"

IMX_DEFAULT_DISTRO_FEATURES = "largefile opengl ptest multiarch"
IMX_DEFAULT_EXTRA_RDEPENDS = "packagegroup-core-boot"
IMX_DEFAULT_EXTRA_RRECOMMENDS = "kernel-module-af-packet"
IMAGE_FSTYPES = "tar.bz2 ext4 sdcard"

BBMASK = "meta-fsl-arm/recipes-bsp/u-boot/u-boot-imx_2015.04.bb"
BBMASK .= "|meta-fsl-arm/recipes-bsp/u-boot/u-boot-imx-mfgtool_2015.04.bb"
BBMASK .= "|meta-fsl-arm/recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad_%.bbappend"
BBMASK .= "|meta-freescale/recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad_%.bbappend"
BBMASK .= "|meta-fsl-arm/openembedded-layer/recipes-support/opencv/opencv_2.4.bbappend"
BBMASK .= "|meta-fsl-arm/qt5-layer/recipes-qt/qt5/qtbase_%.bbappend"

DISTRO_FEATURES ?= "${DISTRO_FEATURES_DEFAULT} ${DISTRO_FEATURES_LIBC} ${IMX_DEFAULT_DISTRO_FEATURES}"
# Comment out the 2 lines below to use bluez4.
DISTRO_FEATURES_append_mx6 = " bluez5"
DISTRO_FEATURES_append_mx6ul = "bluez5"
DISTRO_FEATURES_append_mx7 = " bluez5"

SDK_NAME = "${DISTRO}-${TCLIBC}-${SDK_ARCH}-${IMAGE_BASENAME}-${TUNE_PKGARCH}"
SDKPATH = "/opt/${DISTRO}/${SDK_VERSION}"

DISTRO_EXTRA_RDEPENDS += " ${IMX_DEFAULT_EXTRA_RDEPENDS}"
DISTRO_EXTRA_RRECOMMENDS += " ${IMX_DEFAULT_EXTRA_RRECOMMENDS}"

TCLIBCAPPEND = ""

PREMIRRORS ??= "\
bzr://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n \
cvs://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n \
git://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n \
gitsm://.*/.* http://downloads.yoctoproject.org/mirror/sources/ \n \
hg://.*/.*    http://downloads.yoctoproject.org/mirror/sources/ \n \
osc://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n \
p4://.*/.*    http://downloads.yoctoproject.org/mirror/sources/ \n \
svn://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n"

MIRRORS =+ "\
ftp://.*/.*      http://downloads.yoctoproject.org/mirror/sources/ \n \
http://.*/.*     http://downloads.yoctoproject.org/mirror/sources/ \n \
https://.*/.*    http://downloads.yoctoproject.org/mirror/sources/ \n"

# The CONNECTIVITY_CHECK_URI's are used to test whether we can succesfully
# fetch from the network (and warn you if not). To disable the test set
# the variable to be empty.
# Git example url: git://git.yoctoproject.org/yocto-firewall-test;protocol=git;rev=master

CONNECTIVITY_CHECK_URIS ?= " \
             https://eula-downloads.yoctoproject.org/index.php \
             http://bugzilla.yoctoproject.org/report.cgi"

SANITY_TESTED_DISTROS ?= " \
            poky-1.7 \n \
            poky-1.8 \n \
            Ubuntu-12.04 \n \
            Ubuntu-14.04 \n \
            Ubuntu-14.10 \n \
            Ubuntu-15.04 \n \
            Fedora-21 \n \
            CentOS-6.* \n \
            CentOS-7.* \n \
            Debian-7.* \n \
            Debian-8.* \n \
            openSUSE-project-13.2 \n \
            "

# Default hash policy for distro
BB_SIGNATURE_HANDLER ?= 'OEBasicHash'
#
# OELAYOUT_ABI allows us to notify users when the format of TMPDIR changes in
# an incompatible way. Such changes should usually be detailed in the commit
# that breaks the format and have been previously discussed on the mailing list
# with general agreement from the core team.
#
OELAYOUT_ABI = "11"

# add poky sanity bbclass
INHERIT += "poky-sanity"

# QA check settings - a little stricter than the OE-Core defaults
WARN_TO_ERROR_QA = "already-stripped compile-host-path install-host-path \
                    installed-vs-shipped ldflags pn-overrides rpaths staticdev \
                    useless-rpaths"
WARN_QA_remove = "${WARN_TO_ERROR_QA}"
ERROR_QA_append = " ${WARN_TO_ERROR_QA}"

MACHINE_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT_mx6 = "1"
