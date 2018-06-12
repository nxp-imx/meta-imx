FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0020-logind.conf-Set-HandlePowerKey-to-ignore.patch \
            file://0021-systemd-udevd.service.in-Set-MountFlags-as-shared-to.patch \
"
