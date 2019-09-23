DISTRO = "fsl-imx"
DISTRO_NAME = "NXP i.MX Release Distro"
DISTRO_VERSION = "4.19-warrior"

DISTRO_CODENAME = "warrior"
SDK_VENDOR = "-pokysdk"
SDK_VERSION := "${DISTRO_VERSION}"
#SDK_VERSION := "${@'${DISTRO_VERSION}'.replace('snapshot-${DATE}','snapshot')}"

MAINTAINER = "NXP <lauren.post@nxp.com>"

TARGET_VENDOR = "-poky"

LOCALCONF_VERSION = "1"

IMX_DEFAULT_DISTRO_FEATURES = "opengl ptest multiarch"
# Enable vulkan distro feature only for mx8
IMX_DEFAULT_DISTRO_FEATURES_append_mx8 = " vulkan"
# Enable jailhouse distro feature only for mx8m
IMX_DEFAULT_DISTRO_FEATURES_append_mx8m = " jailhouse"
IMX_DEFAULT_EXTRA_RDEPENDS = "packagegroup-core-boot"
IMX_DEFAULT_EXTRA_RRECOMMENDS = "kernel-module-af-packet"

BBMASK += "poky/meta/recipes-graphics/vulkan/vulkan_1.1.73.0.bb"

DISTRO_FEATURES ?= "${DISTRO_FEATURES_DEFAULT} ${DISTRO_FEATURES_LIBC} ${IMX_DEFAULT_DISTRO_FEATURES}"

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
CONNECTIVITY_CHECK_URIS ?= "https://www.example.com/"

SANITY_TESTED_DISTROS ?= " \
            poky-2.5 \n \
            poky-2.6 \n \
            ubuntu-16.04 \n \
            ubuntu-18.04 \n \
            fedora-28 \n \
            centos-7 \n \
            debian-8 \n \
            debian-9 \n \
            opensuse-42.3 \n \
            "

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
