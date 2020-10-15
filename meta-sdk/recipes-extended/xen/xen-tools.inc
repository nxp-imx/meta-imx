SUMMARY = "Xen hypervisor tools"
DESCRIPTION = "Tools and utility software for the Xen hypervisor"

COMPATIBLE_HOST = 'i686-.*-linux|(x86_64.*).*-linux|aarch64.*-linux|arm-.*-linux-gnueabi'

inherit setuptools3 update-rc.d systemd deploy
require xen-blktap.inc

# To build hvmloader, which is needed on x86-64 targets when 'hvm' is enabled
# in PACKAGECONFIG, to support running HVM-mode guest VMs, some files from
# 32-bit glibc are needed.
# Add the multilib 32-bit glibc to DEPENDS only when necessary.
#
# To enable multilib, please add the following to your local.conf -:
#
#    require conf/multilib.conf
#    MULTILIBS = "multilib:lib32"
#    DEFAULTTUNE_virtclass-multilib-lib32 = "x86"

# Use this multilib prefix for x86 32-bit to match local.conf:
MLPREFIX32 = "lib32-"

# The DEPENDS on a multilib 32-bit glibc is only added when target is x86-64
# and 'hvm' is enabled in PACKAGECONFIG.
# This x86-64 override is never intended for native use, so clear that.
GLIBC32 = ""
GLIBC32_x86-64 = \
    "${@bb.utils.contains('PACKAGECONFIG', 'hvm', '${MLPREFIX32}glibc', '', d)}"
GLIBC32_class-native = ""
DEPENDS += "${GLIBC32}"

RDEPENDS_${PN} = "\
    bash perl xz \
    ${PN}-console \
    ${PN}-libxenguest \
    ${PN}-libxenlight \
    ${PN}-libxenvchan \
    ${PN}-libxenctrl \
    ${PN}-libxlutil \
    ${PN}-libxenstat \
    ${PN}-libxenstore \
    ${PN}-libfsimage \
    ${PN}-fsimage \
    ${PN}-scripts-block \
    ${PN}-scripts-network \
    ${PN}-xen-watchdog \
    ${PN}-xencommons \
    ${PN}-xendomains \
    ${PN}-xenstore \
    virtual/xenstored \
    ${PN}-xl \
    "

RDEPENDS_${PN}-dev = ""

# Qemu is necessary on ARM platforms, and to support HVM guests on x86
QEMU = "${@bb.utils.contains('PACKAGECONFIG', 'hvm', 'qemu', '', d)}"
QEMU_arm = "qemu"
QEMU_aarch64 = "qemu"

RRECOMMENDS_${PN} = " \
    ${QEMU} \
    ${@bb.utils.contains('PACKAGECONFIG', 'hvm', 'seabios', '', d)} \
    ${@bb.utils.contains('PACKAGECONFIG', 'externalblktap', '', '${BLKTAP_RRECOMMENDS}', d)} \
    ${PN}-flask \
    ${PN}-hvmloader \
    ${PN}-libxenhypfs \
    ${PN}-shim \
    ${PN}-ucode \
    ${PN}-vchan \
    ${PN}-xenpaging \
    ${PN}-xenhypfs \
    "

RDEPENDS_${PN}-devd = " \
    ${PN}-xl \
    "

RDEPENDS_${PN}-fsimage = " \
    libext2fs \
    "

RDEPENDS_${PN}-misc = " \
    perl \
    python3 \
    ${PN}-xencov \
    "

RSUGGESTS_${PN}-misc = " \
    ${PN}-xencons \
    ${PN}-xenpvnetboot \
    "

RDEPENDS_${PN}-python = " \
    python3 \
    "

RDEPENDS_${PN}-pygrub = " \
    python3 \
    ${PN}-python \
    "

RDEPENDS_${PN}-remus = "bash"

RDEPENDS_${PN}-scripts-block = "\
    bash \
    ${PN}-scripts-common \
    ${PN}-volatiles \
    "

RDEPENDS_${PN}-scripts-common = "bash"

RDEPENDS_${PN}-scripts-network = "\
    bash \
    bridge-utils \
    ${PN}-scripts-common \
    ${PN}-volatiles \
    "

RSUGGESTS_${PN}-scripts-network = "\
    ifupdown \
    "

RSUGGESTS_${PN}-xencov = "${PN}-xencov-split"

RDEPENDS_${PN}-xencommons = "\
    bash \
    ${PN}-console \
    ${PN}-xenstore \
    virtual/xenstored \
    ${PN}-xl \
    ${PN}-scripts-common \
    "

RDEPENDS_${PN}-xendomains = "\
    bash \
    ${PN}-console \
    ${PN}-scripts-block \
    ${PN}-scripts-common \
    virtual/xenstored \
    "

RDEPENDS_${PN}-xenhypfs = " \
    ${PN}-libxenhypfs \
    "

RDEPENDS_${PN}-xl = "libgcc"

RDEPENDS_${PN}-xenmon = " \
    python3 \
    "

RSUGGESTS_${PN}-xentrace = "${PN}-xentrace-format"

RDEPENDS_${PN}-xen-watchdog = "bash"

PACKAGES = " \
    ${PN} \
    ${@bb.utils.contains('PACKAGECONFIG', 'externalblktap', '', '${BLKTAP_PACKAGES}', d)} \
    ${PN}-console \
    ${PN}-cpuid \
    ${PN}-dbg \
    ${PN}-dev \
    ${PN}-devd \
    ${PN}-doc \
    ${PN}-flask \
    ${PN}-flask-tools \
    ${PN}-fsimage \
    ${PN}-gdbsx \
    ${PN}-hvmloader \
    ${PN}-init-xenstore-dom \
    ${PN}-kdd \
    ${PN}-libfsimage \
    ${PN}-libfsimage-dev \
    ${PN}-libxencall \
    ${PN}-libxencall-dev \
    ${PN}-libxenctrl \
    ${PN}-libxenctrl-dev \
    ${PN}-libxendevicemodel \
    ${PN}-libxendevicemodel-dev \
    ${PN}-libxenevtchn \
    ${PN}-libxenevtchn-dev \
    ${PN}-libxenforeignmemory \
    ${PN}-libxenforeignmemory-dev \
    ${PN}-libxengnttab \
    ${PN}-libxengnttab-dev \
    ${PN}-libxenguest \
    ${PN}-libxenguest-dev \
    ${PN}-libxenhypfs \
    ${PN}-libxenhypfs-dev \
    ${PN}-libxenlight \
    ${PN}-libxenlight-dev \
    ${PN}-libxenstat \
    ${PN}-libxenstat-dev \
    ${PN}-libxenstore \
    ${PN}-libxenstore-dev \
    ${PN}-libxentoolcore \
    ${PN}-libxentoolcore-dev \
    ${PN}-libxentoollog \
    ${PN}-libxentoollog-dev \
    ${PN}-libxenvchan \
    ${PN}-libxenvchan-dev \
    ${PN}-libxlutil \
    ${PN}-libxlutil-dev \
    ${PN}-livepatch \
    ${PN}-misc \
    ${PN}-pygrub \
    ${PN}-python \
    ${PN}-remus \
    ${PN}-scripts-block \
    ${PN}-scripts-common \
    ${PN}-scripts-network \
    ${PN}-shim \
    ${PN}-staticdev \
    ${PN}-ucode \
    ${PN}-vchan \
    ${PN}-volatiles \
    ${PN}-xcutils \
    ${PN}-xencommons \
    ${PN}-xencov \
    ${PN}-xend \
    ${PN}-xend-examples \
    ${PN}-xendomains \
    ${PN}-xenhypfs \
    ${PN}-xenmon \
    ${PN}-xenpaging \
    ${PN}-xenpmd \
    ${PN}-xenstat \
    ${PN}-xenstore \
    ${PN}-xenstored \
    ${PN}-xentrace \
    ${PN}-xen-watchdog \
    ${PN}-xl \
    ${PN}-xl-examples \
    ${PN}-xm \
    ${PN}-xm-examples \
    "

PROVIDES =+ " \
    virtual/xenstored \
    ${@bb.utils.contains('PACKAGECONFIG', 'externalblktap', '', '${BLKTAP_PROVIDES}', d)} \
    "

# There are multiple implementations of the XenStore daemon, so we use a
# virtual package to allow for substitution.
RPROVIDES_${PN}-xenstored = "virtual/xenstored"

FILES_${PN}-dbg += "\
    ${libdir}/xen/bin/.debug \
    ${libdir}/${PYTHON_DIR}/site-packages/.debug \
    ${libdir}/${PYTHON_DIR}/site-packages/xen/lowlevel/.debug \
    ${libdir}/fs/xfs/.debug \
    ${libdir}/fs/ufs/.debug \
    ${libdir}/fs/ext2fs-lib/.debug \
    ${libdir}/fs/fat/.debug \
    ${libdir}/fs/zfs/.debug \
    ${libdir}/fs/reiserfs/.debug \
    ${libdir}/fs/iso9660/.debug \
    ${libdir}/fs/**/.debug \
    ${sbindir}/.debug \
    ${libdir}exec/.debug \
    ${libdir}/xen/libexec/.debug \
    ${bindir}/.debug \
    ${libdir}/${PYTHON_DIR}/dist-packages/.debug \
    ${libdir}/${PYTHON_DIR}/dist-packages/xen/lowlevel/.debug \
    "

FILES_${PN}-dev = "\
    ${includedir} \
    "

FILES_${PN}-doc = "\
    ${sysconfdir}/xen/README \
    ${sysconfdir}/xen/README.incompatibilities \
    ${datadir}/doc \
    ${datadir}/man \
    "

FILES_${PN}-staticdev += "\
    ${libdir}/libxenguest.a \
    ${libdir}/libxenlight.a \
    ${libdir}/libxenvchan.a \
    ${libdir}/libxenctrl.a \
    ${libdir}/libxlutil.a \
    ${libdir}/libxenstat.a \
    ${libdir}/libxenstore.a \
    "

FILES_${PN}-libxencall = "${libdir}/libxencall.so.*"
FILES_${PN}-libxencall-dev = " \
    ${libdir}/libxencall.so \
    ${libdir}/pkgconfig/xencall.pc \
    ${datadir}/pkgconfig/xencall.pc \
    "

FILES_${PN}-libxenctrl = "${libdir}/libxenctrl.so.*"
FILES_${PN}-libxenctrl-dev = " \
    ${libdir}/libxenctrl.so \
    ${libdir}/pkgconfig/xencontrol.pc \
    ${datadir}/pkgconfig/xencontrol.pc \
    "

FILES_${PN}-libxendevicemodel = "${libdir}/libxendevicemodel.so.*"
FILES_${PN}-libxendevicemodel-dev = " \
    ${libdir}/libxendevicemodel.so \
    ${libdir}/pkgconfig/xendevicemodel.pc \
    ${datadir}/pkgconfig/xendevicemodel.pc \
    "

FILES_${PN}-libxenevtchn = "${libdir}/libxenevtchn.so.*"
FILES_${PN}-libxenevtchn-dev = " \
    ${libdir}/libxenevtchn.so \
    ${libdir}/pkgconfig/xenevtchn.pc \
    ${datadir}/pkgconfig/xenevtchn.pc \
    "

FILES_${PN}-libxenforeignmemory = "${libdir}/libxenforeignmemory.so.*"
FILES_${PN}-libxenforeignmemory-dev = " \
    ${libdir}/libxenforeignmemory.so \
    ${libdir}/pkgconfig/xenforeignmemory.pc \
    ${datadir}/pkgconfig/xenforeignmemory.pc \
    "

FILES_${PN}-libxengnttab = "${libdir}/libxengnttab.so.*"
FILES_${PN}-libxengnttab-dev = " \
    ${libdir}/libxengnttab.so \
    ${libdir}/pkgconfig/xengnttab.pc \
    ${datadir}/pkgconfig/xengnttab.pc \
    "

FILES_${PN}-libxenguest = "${libdir}/libxenguest.so.*"
FILES_${PN}-libxenguest-dev = " \
    ${libdir}/libxenguest.so \
    ${libdir}/pkgconfig/xenguest.pc \
    ${datadir}/pkgconfig/xenguest.pc \
    "

FILES_${PN}-libxenhypfs = "${libdir}/libxenhypfs.so.*"
FILES_${PN}-libxenhypfs-dev = " \
    ${libdir}/libxenhypfs.so \
    ${libdir}/pkgconfig/xenhypfs.pc \
    "

FILES_${PN}-libxenlight = "${libdir}/libxenlight.so.*"
FILES_${PN}-libxenlight-dev = " \
    ${libdir}/libxenlight.so \
    ${libdir}/pkgconfig/xenlight.pc \
    ${datadir}/pkgconfig/xenlight.pc \
    "

FILES_${PN}-libxenstat = "${libdir}/libxenstat.so.*"
FILES_${PN}-libxenstat-dev = " \
    ${libdir}/libxenstat.so \
    ${libdir}/pkgconfig/xenstat.pc \
    ${datadir}/pkgconfig/xenstat.pc \
    "

FILES_${PN}-libxenstore = "${libdir}/libxenstore.so.*"
FILES_${PN}-libxenstore-dev = " \
    ${libdir}/libxenstore.so \
    ${libdir}/pkgconfig/xenstore.pc \
    ${datadir}/pkgconfig/xenstore.pc \
    "

FILES_${PN}-libxentoolcore = "${libdir}/libxentoolcore.so.*"
FILES_${PN}-libxentoolcore-dev = " \
    ${libdir}/libxentoolcore.so \
    ${libdir}/pkgconfig/xentoolcore.pc \
    ${datadir}/pkgconfig/xentoolcore.pc \
    "

FILES_${PN}-libxentoollog = "${libdir}/libxentoollog.so.*"
FILES_${PN}-libxentoollog-dev = " \
    ${libdir}/libxentoollog.so \
    ${libdir}/pkgconfig/xentoollog.pc \
    ${datadir}/pkgconfig/xentoollog.pc \
    "

FILES_${PN}-libxenvchan = "${libdir}/libxenvchan.so.*"
FILES_${PN}-libxenvchan-dev = " \
    ${libdir}/libxenvchan.so \
    ${libdir}/pkgconfig/xenvchan.pc \
    ${datadir}/pkgconfig/xenvchan.pc \
    "

FILES_${PN}-libxlutil = "${libdir}/libxlutil.so.*"
FILES_${PN}-libxlutil-dev = " \
    ${libdir}/libxlutil.so \
    ${libdir}/pkgconfig/xlutil.pc \
    ${datadir}/pkgconfig/xlutil.pc \
    "
FILES_${PN}-libvhd = "${libdir}/libvhd.so.*"
FILES_${PN}-libvhd-dev = " \
    ${libdir}/libvhd.so \
    ${libdir}/pkgconfig/vhd.pc \
    ${datadir}/pkgconfig/vhd.pc \
    "

FILES_${PN}-libfsimage = " \
    ${libdir}/libfsimage.so.* \
    ${libdir}/libxenfsimage.so.* \
    "

FILES_${PN}-libfsimage-dev = " \
    ${libdir}/libfsimage.so \
    ${libdir}/libxenfsimage.so \
    ${libdir}/pkgconfig/fsimage.pc \
    ${datadir}/pkgconfig/fsimage.pc \
    ${libdir}/pkgconfig/xenfsimage.pc \
    ${datadir}/pkgconfig/xenfsimage.pc \
    "

FILES_${PN}-fsimage = " \
    ${libdir}/fs/**/[a-z]*fsimage.so \
    ${libdir}/xenfsimage/**/fsimage.so \
    "

FILES_${PN}-init-xenstore-dom = "${libdir}/xen/bin/init-xenstore-domain"

FILES_${PN} = "\
    ${sysconfdir}/xen/auto \
    ${sysconfdir}/xen/cpupool \
    ${localstatedir}/xen/dump \
    "

FILES_${PN}-console = "\
    ${libdir}/xen/bin/xenconsole \
    ${sbindir}/xenconsoled \
    "

FILES_${PN}-cpuid = "\
    ${bindir}/xen-cpuid \
    "

FILES_${PN}-devd = "\
    ${sysconfdir}/init.d/xendriverdomain \
    ${systemd_unitdir}/system/xendriverdomain.service \
    "

FILES_${PN}-flask = "\
    /boot/xenpolicy-* \
    "

FILES_${PN}-flask-tools = "\
    ${sbindir}/flask-get-bool \
    ${sbindir}/flask-getenforce \
    ${sbindir}/flask-label-pci \
    ${sbindir}/flask-loadpolicy \
    ${sbindir}/flask-set-bool \
    ${sbindir}/flask-setenforce \
    "

FILES_${PN}-gdbsx = "\
    ${sbindir}/gdbsx \
    "

INSANE_SKIP_${PN}-hvmloader = "arch"
FILES_${PN}-hvmloader = "\
    ${libdir}/xen/boot/hvmloader \
    "

FILES_${PN}-kdd = "\
    ${sbindir}/kdd \
    ${sbindir}/xen-kdd \
    "

FILES_${PN}-livepatch += " \
    ${sbindir}/xen-livepatch \
    "

FILES_${PN}-misc = "\
    ${bindir}/xen-detect \
    ${libdir}/xen/bin/depriv-fd-checker \
    ${sbindir}/gtracestat \
    ${sbindir}/gtraceview \
    ${sbindir}/xen-bugtool \
    ${sbindir}/xenperf \
    ${sbindir}/xenpm \
    ${sbindir}/xsview \
    ${sbindir}/xen-diag \
    ${sbindir}/xen-tmem-list-parse \
    ${sbindir}/xen-python-path \
    ${sbindir}/xen-ringwatch \
    ${sbindir}/xen-hptool \
    ${sbindir}/xen-hvmcrash \
    ${sbindir}/xen-hvmctx \
    ${sbindir}/xenlockprof \
    ${sbindir}/xen-lowmemd \
    ${sbindir}/xen-mfndump \
    ${libdir}/xen/bin/verify-stream-v2 \
    ${libdir}/xen/bin/convert-legacy-stream \
    "

FILES_${PN}-pygrub = "\
    ${bindir}/pygrub \
    ${libdir}/xen/bin/pygrub \
    "

FILES_${PN}-python = "\
    ${libdir}/${PYTHON_DIR} \
    "

FILES_${PN}-remus = "\
    ${sysconfdir}/xen/scripts/remus-netbuf-setup \
    "

FILES_${PN}-scripts-network = " \
    ${sysconfdir}/xen/scripts/colo-proxy-setup \
    ${sysconfdir}/xen/scripts/network-bridge \
    ${sysconfdir}/xen/scripts/network-nat \
    ${sysconfdir}/xen/scripts/network-route \
    ${sysconfdir}/xen/scripts/qemu-ifup \
    ${sysconfdir}/xen/scripts/vif2 \
    ${sysconfdir}/xen/scripts/vif-bridge \
    ${sysconfdir}/xen/scripts/vif-common.sh \
    ${sysconfdir}/xen/scripts/vif-nat \
    ${sysconfdir}/xen/scripts/vif-openvswitch \
    ${sysconfdir}/xen/scripts/vif-route \
    ${sysconfdir}/xen/scripts/vif-setup \
    "

FILES_${PN}-scripts-block = " \
    ${sysconfdir}/xen/scripts/blktap \
    ${sysconfdir}/xen/scripts/block \
    ${sysconfdir}/xen/scripts/block-common.sh \
    ${sysconfdir}/xen/scripts/block-dummy \
    ${sysconfdir}/xen/scripts/block-enbd \
    ${sysconfdir}/xen/scripts/block-iscsi \
    ${sysconfdir}/xen/scripts/block-nbd \
    ${sysconfdir}/xen/scripts/block-drbd-probe \
    ${sysconfdir}/xen/scripts/block-tap \
    ${sysconfdir}/xen/scripts/vscsi \
    "

FILES_${PN}-scripts-common = " \
    ${sysconfdir}/xen/scripts/external-device-migrate \
    ${sysconfdir}/xen/scripts/hotplugpath.sh \
    ${sysconfdir}/xen/scripts/locking.sh \
    ${sysconfdir}/xen/scripts/logging.sh \
    ${sysconfdir}/xen/scripts/xen-hotplug-cleanup \
    ${sysconfdir}/xen/scripts/xen-hotplug-common.sh \
    ${sysconfdir}/xen/scripts/xen-network-common.sh \
    ${sysconfdir}/xen/scripts/xen-script-common.sh \
    "

INSANE_SKIP_${PN}-shim = "arch"
FILES_${PN}-shim = " \
    ${libdir}/xen/boot/xen-shim \
    "

FILES_${PN}-ucode = "\
    ${sbindir}/xen-ucode \
    "

FILES_${PN}-vchan = "\
    ${bindir}/vchan-socket-proxy \
    "

FILES_${PN}-volatiles = "\
    ${sysconfdir}/default/volatiles/99_xen \
    ${sysconfdir}/tmpfiles.d/xen.conf \
    "

FILES_${PN}-xcutils = "\
    ${libdir}/xen/bin/lsevtchn \
    ${libdir}/xen/bin/readnotes \
    ${libdir}/xen/bin/xc_restore \
    ${libdir}/xen/bin/xc_save \
    "

FILES_${PN}-xencov = "\
    ${sbindir}/xencov \
    "

FILES_${PN}-xend-examples = "\
    ${sysconfdir}/xen/xend-config.sxp \
    ${sysconfdir}/xen/xend-pci-permissive.sxp \
    ${sysconfdir}/xen/xend-pci-quirks.sxp \
    "

FILES_${PN}-xenhypfs = "\
    ${sbindir}/xenhypfs \
    "

FILES_${PN}-xenpaging = "\
    ${libdir}/xen/bin/xenpaging \
    ${localstatedir}/lib/xen/xenpaging \
    "

FILES_${PN}-xenpmd = "\
    ${sbindir}/xenpmd \
    "

FILES_${PN}-xenstat = "\
    ${sbindir}/xentop \
    "

FILES_${PN}-xenstore = "\
    ${bindir}/xenstore \
    ${bindir}/xenstore-chmod \
    ${bindir}/xenstore-control \
    ${bindir}/xenstore-exists \
    ${bindir}/xenstore-list \
    ${bindir}/xenstore-ls \
    ${bindir}/xenstore-read \
    ${bindir}/xenstore-rm \
    ${bindir}/xenstore-watch \
    ${bindir}/xenstore-write \
    "

FILES_${PN}-xenstored = "\
    ${sbindir}/xenstored \
    ${localstatedir}/lib/xenstored \
    "

FILES_${PN}-xentrace = "\
    ${bindir}/xentrace \
    ${bindir}/xentrace_setsize \
    ${libdir}/xen/bin/xenctx \
    ${bindir}/xenalyze \
    ${sbindir}/xentrace \
    ${sbindir}/xentrace_setsize \
    ${sbindir}/xentrace_setmask \
    "

FILES_${PN}-xen-watchdog = "\
    ${sbindir}/xenwatchdogd \
    ${sysconfdir}/init.d/xen-watchdog \
    ${systemd_unitdir}/system/xen-watchdog.service \
    "

FILES_${PN}-xl = "\
    ${sysconfdir}/bash_completion.d/xl.sh \
    ${sysconfdir}/xen/xl.conf \
    ${libdir}/xen/bin/libxl-save-helper \
    ${sbindir}/xl \
    ${libdir}/xen/bin/xen-init-dom0 \
    "

FILES_${PN}-xl-examples = "\
    ${sysconfdir}/xen/xlexample.hvm \
    ${sysconfdir}/xen/xlexample.pvlinux \
    "

FILES_${PN}-xm-examples = "\
    ${sysconfdir}/xen/xmexample1 \
    ${sysconfdir}/xen/xmexample2 \
    ${sysconfdir}/xen/xmexample3 \
    ${sysconfdir}/xen/xmexample.hvm \
    ${sysconfdir}/xen/xmexample.hvm-stubdom \
    ${sysconfdir}/xen/xmexample.nbd \
    ${sysconfdir}/xen/xmexample.pv-grub \
    ${sysconfdir}/xen/xmexample.vti \
    "

FILES_${PN}-xenmon = "\
    ${sbindir}/xenbaked \
    ${sbindir}/xenmon.py \
    ${sbindir}/xenmon \
    "

FILES_${PN}-xm = "\
    ${sysconfdir}/xen/xm-config.xml \
    ${datadir}/xen/create.dtd \
    ${sbindir}/xm \
    "

FILES_${PN}-xencommons += "\
    ${sysconfdir}/default/xencommons \
    ${sysconfdir}/init.d/xencommons \
    ${sysconfdir}/xen/scripts/launch-xenstore \
    ${systemd_unitdir}/modules-load.d/xen.conf \
    ${systemd_unitdir}/system/proc-xen.mount \
    ${systemd_unitdir}/system/xen-qemu-dom0-disk-backend.service \
    ${systemd_unitdir}/system/xenconsoled.service \
    ${systemd_unitdir}/system/xen-init-dom0.service \
    ${systemd_unitdir}/system/xenstored.service \
    ${systemd_unitdir}/system/var-lib-xenstored.mount \
    "

FILES_${PN}-xend += " \
    ${sysconfdir}/init.d/xend \
    ${sbindir}/xend \
    "

FILES_${PN}-xendomains += "\
    ${libdir}/xen/bin/xendomains \
    ${sysconfdir}/default/xendomains \
    ${sysconfdir}/init.d/xendomains \
    ${sysconfdir}/sysconfig/xendomains \
    ${systemd_unitdir}/system/xendomains.service \
    "

INSANE_SKIP_${PN} = "already-stripped"

# configure init.d scripts
INITSCRIPT_PACKAGES = "${PN}-xend ${PN}-xencommons ${PN}-xen-watchdog ${PN}-xendomains ${PN}-devd"
INITSCRIPT_NAME_${PN}-xencommons = "xencommons"
INITSCRIPT_PARAMS_${PN}-xencommons = "defaults 80"
INITSCRIPT_NAME_${PN}-xen-watchdog = "xen-watchdog"
INITSCRIPT_PARAMS_${PN}-xen-watchdog = "defaults 81"
INITSCRIPT_NAME_${PN}-xend = "xend"
INITSCRIPT_PARAMS_${PN}-xend = "defaults 82"
INITSCRIPT_NAME_${PN}-xendomains = "xendomains"
INITSCRIPT_PARAMS_${PN}-xendomains = "defaults 83"
INITSCRIPT_NAME_${PN}-devd = "xendriverdomain"
INITSCRIPT_PARAMS_${PN}-devd = "defaults 82"

# systemd packages
SYSTEMD_PACKAGES = "${PN}-xen-watchdog ${PN}-xencommons ${PN}-xendomains ${PN}-devd"
SYSTEMD_SERVICE_${PN}-devd = "xendriverdomain.service"
SYSTEMD_SERVICE_${PN}-xen-watchdog = "xen-watchdog.service"
SYSTEMD_SERVICE_${PN}-xencommons = " \
    proc-xen.mount \
    var-lib-xenstored.mount \
    xen-qemu-dom0-disk-backend.service \
    xenconsoled.service \
    xen-init-dom0.service \
    xenstored.service \
    "
SYSTEMD_SERVICE_${PN}-xendomains = "xendomains.service"

# To build hvmloader, which is needed on x86-64 targets when 'hvm' is enabled
# in PACKAGECONFIG, additional CFLAGS are needed to set the 32-bit sysroot.
RECIPE_SYSROOT32 = "${WORKDIR}/${MLPREFIX32}recipe-sysroot"
ADD_SYSROOT32_CFLAGS = ""
ADD_SYSROOT32_CFLAGS_x86-64 = \
    "${@bb.utils.contains('PACKAGECONFIG', 'hvm', \
        'CFLAGS += "--sysroot=${RECIPE_SYSROOT32}"', '', d)}"
# This x86-64 override is never intended for native use, so clear that.
ADD_SYSROOT32_CFLAGS_class-native = ""

EXTRA_OECONF += " \
    --with-systemd=${systemd_unitdir}/system \
    --with-systemd-modules-load=${systemd_unitdir}/modules-load.d \
    --with-initddir=${INIT_D_DIR} \
    --with-sysconfig-leaf-dir=default \
    --with-system-qemu=${bindir}/qemu-system-i386 \
    "

do_configure() {
    do_configure_common

    if [ -n '${ADD_SYSROOT32_CFLAGS}' ] ; then
        echo '${ADD_SYSROOT32_CFLAGS}' >>"${S}/tools/firmware/Rules.mk"
    fi
}

do_compile() {
    cd ${S}
    oe_runmake tools PYTHON="${PYTHON}"
}

do_install() {
    cd ${S}
    oe_runmake DESTDIR="${D}" install-tools

    # Remove unported python 2 scripts -- see the separate xen-python2 recipe
    rm -f ${D}${bindir}/xentrace_format \
          ${D}${bindir}/xencons \
          ${D}${bindir}/xencov_split \
          ${D}${libdir}/xen/bin/xenpvnetboot

    # remove installed volatiles
    rm -rf ${D}${base_prefix}/run \
        ${D}${localstatedir}/run \
        ${D}${localstatedir}/lock \
        ${D}${localstatedir}/log \
        ${D}${localstatedir}/volatile \
        ${D}${localstatedir}/lib/xen

    VOLATILE_DIRS=" \
        ${base_prefix}/run/xenstored \
        ${base_prefix}/run/xend \
        ${base_prefix}/run/xend/boot \
        ${base_prefix}/run/xen \
        ${localstatedir}/log/xen \
        ${localstatedir}/lock/xen \
        ${localstatedir}/lock/subsys \
        ${localstatedir}/lib/xen \
        "

    # install volatiles using populate_volatiles mechanism
    install -d ${D}${sysconfdir}/default/volatiles
    for i in $VOLATILE_DIRS; do
        echo "d root root 0755 $i none"  >> ${D}${sysconfdir}/default/volatiles/99_xen
    done

    # workaround for xendomains script which searchs sysconfig if directory exists
    install -d ${D}${sysconfdir}/sysconfig
    ln -sf ${sysconfdir}/default/xendomains ${D}${sysconfdir}/sysconfig/xendomains

    # systemd
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        # install volatiles using systemd tmpfiles.d
        install -d ${D}${sysconfdir}/tmpfiles.d
        for i in $VOLATILE_DIRS; do
            echo "d $i 0755 root root - -"  >> ${D}${sysconfdir}/tmpfiles.d/xen.conf
        done
    fi

    # fixup default path to qemu-system-i386
    sed -i 's#\(test -z "$QEMU_XEN" && QEMU_XEN=\).*$#\1"/usr/bin/qemu-system-i386"#' ${D}/etc/init.d/xencommons

    if [ -e ${D}${systemd_unitdir}/system/xen-qemu-dom0-disk-backend.service ]; then
        sed -i 's#ExecStart=.*qemu-system-i386\(.*\)$#ExecStart=/usr/bin/qemu-system-i386\1#' \
            ${D}${systemd_unitdir}/system/xen-qemu-dom0-disk-backend.service
    fi
}

pkg_postinst_${PN}-volatiles() {
    if [ -z "$D" ]; then
        if command -v systemd-tmpfiles >/dev/null; then
            systemd-tmpfiles --create ${sysconfdir}/tmpfiles.d/xen.conf
        elif [ -e ${sysconfdir}/init.d/populate-volatile.sh ]; then
            ${sysconfdir}/init.d/populate-volatile.sh update
        fi
    fi
}

do_deploy() {
    XEN_FULLVERSION=$(oe_runmake -C ${S}/xen xenversion --no-print-directory)
    FLASK_POLICY_FILE="xenpolicy-${XEN_FULLVERSION}"

    install -d ${DEPLOYDIR}

    # Install the flask policy in the deploy directory if it exists
    if [ -f ${D}/boot/${FLASK_POLICY_FILE} ]; then
        install -m 0644 ${D}/boot/${FLASK_POLICY_FILE} ${DEPLOYDIR}
        ln -sf ${FLASK_POLICY_FILE} ${DEPLOYDIR}/xenpolicy-${MACHINE}
    fi
}
# Scheduling the do_deploy task:
# - deploy copies files from ${D} that are written during do_install so must run
#   after that task
# - the tools binaries are included in the image filesystem, so we must ensure
#   that the binaries deployed match what is staged in the sysroot:
#   so do_deploy must run after do_populate_sysroot
# - add the task before do_build to ensure that deployment has completed when
#   the recipe build done stamp is written
addtask deploy after do_install do_populate_sysroot before do_build
