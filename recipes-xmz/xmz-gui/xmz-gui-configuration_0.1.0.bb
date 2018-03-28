SUMMARY = "systemd Unit file für die 'xmz-gui' Konfiguration"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/xmz-gui"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += " \
	file://xmz-gui-configuration.service \
"
PR = "r0"

S = "${WORKDIR}"

do_install_append() {
		install -Dm0644 ${WORKDIR}/xmz-gui-configuration.service ${D}${systemd_system_unitdir}/xmz-gui-configuration.service
}

FILES_${PN} += "/lib/"

inherit systemd

SYSTEMD_SERVICE_${PN} = "xmz-gui-configuration.service"
