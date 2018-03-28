SUMMARY = "systemd Unit file für die 'xmz-server' Konfiguration"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/xMZ-Mod-Touch-Server"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += " \
	file://boot.mount \
	file://xmz-server-configuration.service \
"
PR = "r0"

S = "${WORKDIR}"

do_install_append() {
    install -Dm0644 ${WORKDIR}/boot.mount ${D}${systemd_system_unitdir}/boot.mount
		install -Dm0644 ${WORKDIR}/xmz-server-configuration.service ${D}${systemd_system_unitdir}/xmz-server-configuration.service
}

FILES_${PN} += "/lib/"

inherit systemd

SYSTEMD_SERVICE_${PN} = "xmz-server-configuration.service"
